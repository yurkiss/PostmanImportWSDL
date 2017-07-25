package io.ctdev.postmancollection;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import io.ctdev.postmancollection.model.json.*;
import org.reficio.ws.SoapContext;
import org.reficio.ws.builder.SoapBuilder;
import org.reficio.ws.builder.SoapOperation;
import org.reficio.ws.builder.core.Wsdl;
import org.reficio.ws.common.SimpleValuesProvider;

import javax.xml.namespace.QName;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.*;

/**
 * Created by yurkiss on 7/21/17.
 */
public class ParseWsdl {

    public static final String WSDL_PATH = "/Users/yurkiss/Documents/CTM/partner.wsdl";
    public static final String POSTMAN_PATH = "/Users/yurkiss/Documents/CTM/postman.json";

    public static void main(String[] args) throws MalformedURLException {
        Wsdl wsdl = Wsdl.parse(new File(WSDL_PATH).toURI().toURL());

        SimpleValuesProvider provider = new SimpleValuesProvider() {
            @Override
            public Set<String> getMultiValues(QName name) {
                Set<String> multiValues = super.getMultiValues(name);
                if (multiValues.size() == 0) multiValues.add("?");
                return multiValues;
            }
        };
        HashSet<String> values = new HashSet<>();
        values.add("{{session_id}}");
        provider.addMultiValues(new QName("urn:partner.soap.sforce.com", "sessionId"), values);

        SoapContext soapContext = SoapContext.builder()
                .exampleContent(false)
                .multiValuesProvider(provider)
                .build();

        SoapBuilder builder = wsdl.binding()
                .localPart("SoapBinding")
                .find();

//        SoapOperation operation = builder.operation()
//                .name("describeSObject")
//                .find();
//
//        Item item1 = getItemForOperation(builder, operation, soapContext);

        ArrayList<Item> items = new ArrayList<>();
        List<SoapOperation> operations = builder.getOperations();
        for (SoapOperation soapOperation : operations) {
            Item item = getItemForOperation(builder, soapOperation, soapContext);
            items.add(item);
        }

        try {

            Root root = new Root();
            Info info = new Info();
            info.setName("SF Partner");
            info.setPostmanId(UUID.randomUUID().toString());
            info.setDescription("Salesforce partner API");
            info.setSchema("https://schema.getpostman.com/json/collection/v2.0.0/collection.json");
            root.setInfo(info);
            root.setItem(items);

            ObjectMapper objectMapper = new ObjectMapper();
//            Root root = objectMapper.readValue(new File(JSON_FILE), Root.class);
            ObjectWriter writer = objectMapper.writer(new DefaultPrettyPrinter(System.lineSeparator()));
            writer.writeValue(System.out, root);
            writer.writeValue(new File(POSTMAN_PATH), root);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Request getRequest(SoapBuilder builder, SoapOperation operation, SoapContext soapContext) {
        Request request = new Request();
        String url = "{{soap_url}}";
        request.setUrl(url);
        request.setMethod("POST");

        List<Header> headers = getHeaders();
        request.setHeader(headers);

        Body body = getBody(builder, operation, soapContext);
        request.setBody(body);
        return request;
    }

    private static Body getBody(SoapBuilder builder, SoapOperation op, SoapContext soapContext) {

        String raw = builder.buildInputMessage(op, soapContext);

        Body body = new Body();
        body.setMode("raw");
        body.setRaw(raw);
        return body;
    }

    private static List<Header> getHeaders() {
        Header header1 = new Header();
        header1.setKey("Content-Type");
        header1.setValue("text/xml");
        header1.setDescription("");

        Header header2 = new Header();
        header2.setKey("SOAPAction");
        header2.setValue("\"\"");
        header2.setDescription("");

        return Arrays.asList(header1, header2);
    }

    private static Item getItemForOperation(SoapBuilder builder, SoapOperation op, SoapContext soapContext) {
        String operationName = op.getOperationName();

        ItemGroup itemGroup = new ItemGroup();
        itemGroup.setName(operationName);

        ItemImpl item1 = new ItemImpl();
        item1.setName(operationName + " #1");
        item1.setDescription("");

        Request request = getRequest(builder, op, soapContext);

        item1.setRequest(request);

        itemGroup.setItem(Collections.singletonList(item1));

        return itemGroup;
    }


}
