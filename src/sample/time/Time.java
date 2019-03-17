package sample.time;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Time {
    public static void main(String[] args) {
        //定义开始和停止的两时间
        String startTime ="2019-3-17 6:45:00";
        String stopTime ="2019-3-18 6:45:00";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
        Date d1;
        Date d2;
        long diff =0;
        //通过SimpleDateFormat的对象吧String 类型的时间对象转化为Date类型的对象；
        try{
            d1 = format.parse(startTime);

            d2 =format.parse(stopTime);
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
