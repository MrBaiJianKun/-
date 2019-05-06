package server.test1;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //船舰客户端对象指定连接的服务器IP和端口
        Socket socket=new Socket("39.96.182.225",8080);
        System.out.println("已和服务器建立连接，远程主机地址："+socket.getRemoteSocketAddress());
    }
}
