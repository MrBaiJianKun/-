package sample.time;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Time {
    public static void main(String[] args) {
        //定义开始和停止的两时间
        Scanner scanner = new Scanner(System.in);
        //输入第一个时间点
        System.out.println("输入第一个时间点: ");
        String time1 = scanner.nextLine();
        //输入第二个时间点
        System.out.println("输入第二个时间点: ");
        String time2 = scanner.nextLine();
        scanner.close();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1;
        Date d2;
        long diff =0;
        //通过SimpleDateFormat的对象吧String 类型的时间对象转化为Date类型的对象；
        try{
            d1 = format.parse(time1);
            d2 = format.parse(time2);
            diff = d1.getTime() - d2.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //将毫秒分别算成秒 ，分，小时，天
        long diffSeconds = diff/1000;
        long diffMinutes =diff/ (1000*60);
        long diffHours = diff/(1000*60*60);
        long diffDays =diff/(1000*60*60*24);

        System.out.println("两个时间差"+Math.abs(diffSeconds)+"秒");
        System.out.println("两个时间差"+Math.abs(diffMinutes)+"分");
        System.out.println("两个时间差"+Math.abs(diffHours)+"小时");
        System.out.println("两个时间差"+Math.abs(diffDays)+"天");
    }
}
