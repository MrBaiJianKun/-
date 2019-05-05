package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket sa= new ServerSocket(10086);
        System.out.println("服务器，端口号："+sa.getLocalPort());
        while (true){
            //获得客户端对象的连接
            Socket socket=sa.accept();
            System.out.println("客户端："+socket.getInetAddress()+"上线了");
            socket.close();
        }

    }
}
