package wrh.gs.hellodubbo.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import wrh.gs.hellodubbo.HelloService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wurenhai
 * @date 2017/12/20
 */
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

}
