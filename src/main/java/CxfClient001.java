import com.offcn.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class CxfClient001 {

    public static void main(String[] args) {
        String url="http://localhost:8080/services/hello";
        //创建cxf框架提供的远程代理工厂bean
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        //设置远程调用地址
        factoryBean.setAddress(url);
        //设置接口反射类给远程调用对象
        factoryBean.setServiceClass(HelloService.class);

        //远程调用
        HelloService service=(HelloService) factoryBean.create();

        //调用
        String s = service.sayHello("钟炜");
        System.out.println(s);

    }
}
