package example.rpc.simple;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @author lr
 * @date 2020/12/7
 */
public class RPCTest {
    public static void main(String[] args) throws IOException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Server serviceServer = new ServiceCenter(8088);
                    serviceServer.register(ServiceProducer.class, ServiceProducerImpl.class);
                    serviceServer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        ServiceProducer service = RPCClient.getRemoteProxyObj(ServiceProducer.class, new InetSocketAddress("localhost", 8088));
        System.out.println(service.sendData("test"));
    }
}
