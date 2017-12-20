package wrh.gs.hellodubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wurenhai
 * @date 2017/12/20
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-hello-provider.xml"});
        context.start();

        System.in.read();
    }

}
