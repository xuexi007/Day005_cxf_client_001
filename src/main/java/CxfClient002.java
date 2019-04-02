import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import javax.xml.namespace.QName;

public class CxfClient002 {
    public static void main(String[] args) {
        String url="http://localhost:8080/services/hello?wsdl";
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        Client client = factory.createClient(url);

            QName qName = new QName("http://service.offcn.com/", "sayHello");

            try {
                Object[] objects = client.invoke(qName,"sunny");
                System.out.println(objects[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
