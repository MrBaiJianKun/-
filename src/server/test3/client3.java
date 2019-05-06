package server.test3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class client3 {
    public static void main(String[] args)  throws IOException {
        Socket client=new Socket("localhost",10086);
        System.out.println("成功连接服务器");
        Scanner scanner=new Scanner(System.in);
        BufferedWriter buf;
        System.out.println("请输入一行信息");
        String str=scanner.nextLine();
        buf=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        buf.write(str);
        buf.flush();
        buf.close();
    }
}
