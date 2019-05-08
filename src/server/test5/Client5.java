package server.test5;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.UUID;

public class Client5 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1", 10086);
        System.out.println("成功连接上服务器......");
        InputStream inputStream = client.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(inputStream);
        System.out.println("请输入你要保存的路径");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path + "/" + UUID.randomUUID().toString() + ".jpg");
        OutputStream outputStream = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        byte[] data = new byte[1024];
        int tmp;
        while ((tmp = bis.read(data)) != -1) {
            bos.write(data, 0, tmp);
        }
        System.out.println("以保存到:  "+path+" , 路径名："+path+ UUID.randomUUID().toString() + ".jpg");
        bis.close();
        bos.close();
        client.close();

    }
}

