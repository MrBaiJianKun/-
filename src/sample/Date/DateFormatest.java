package sample.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatest {

    public static void main(String[] args) {
        //创建日期
        Date date= new Date();
        //创下不同的日期格式
        DateFormat df1 = DateFormat.getInstance();
        DateFormat df2=new SimpleDateFormat("yyy-MM-dd hh:mm:ss EE");
        DateFormat df3=new SimpleDateFormat("yyy年MM月dd日 hh时mm分ss秒 EE", Locale.CANADA);
        DateFormat df4=new SimpleDateFormat("yyy-MM-dd hh:mm:ss EE",Locale.US);
        DateFormat df5=new SimpleDateFormat("yyy-MM-dd");
        DateFormat df6=new SimpleDateFormat("yyy年MM月dd日");
        //将日期按照不同格式处理
        System.out.println("-------将日期按照不同格式输出");
        System.out.println("按照Java默认的日期格式： "+df1.format(date));
        System.out.println("按照Java默认的日期格式： "+df1.format(date));
        System.out.println("按照指定格式 yyy-MM-dd hh:mm:ss EE. 系统默认区域： "+df2.format(date));
        System.out.println("按照指定格式 yyy年MM月dd日 hh时mm分ss秒 EE.区域为中国： "+df3.format(date));
        System.out.println("按照指定格式 yyy-MM-dd hh:mm:ss EE.区域为美国： "+df4.format(date));
        System.out.println("按照指定格式 yyy-MM-dd: "+df5.format(date));
        System.out.println("按照指定格式 yyy年MM月dd日: "+df6.format(date));
    }
}
