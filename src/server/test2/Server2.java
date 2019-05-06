package server.test2;


import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10086);
        System.out.println("服务器启动");
        OutputStream out;
        String info="java Socket study";
        while (true){
            Socket socket=ss.accept();
            System.out.println(socket.getInetAddress()+"上线了");
            out=socket.getOutputStream();
            out.write(info.getBytes());
            out.close();
            socket.close();
        }

    }

}
