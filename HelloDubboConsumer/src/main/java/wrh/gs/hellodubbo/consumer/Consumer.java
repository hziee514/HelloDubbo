package wrh.gs.hellodubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import wrh.gs.hellodubbo.HelloService;

/**
 * @author wurenhai
 * @date 2017/12/20
 */
public class Consumer {

    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-hello-consumer.xml"});
        context.start();

        HelloService helloService = (HelloService)context.getBean("helloService");

        for (int i=0; i<10; i++) {
            try {
                Thread.sleep(200);
                String hello = helloService.sayHello("world");
                System.out.print("" + i + " ");
                System.out.println(hello);
            } catch (Throwable tr) {
                tr.printStackTrace();
            }
        }
    }

}
