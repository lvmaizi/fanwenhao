package com.example.fanwenhao;

import org.apache.commons.net.ntp.TimeStamp;
import org.springframework.util.Assert;

import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

/**
 * @Date 2020/7/9 16:09
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws UnknownHostException {
        System.setProperty("mvc.has_error_page_configuration", "false");
        DateTimeFormatter dateFormat9 = DateTimeFormatter.ofPattern(
                "yyyy-MM-dd HH:mm:ss");
//        String formattedDate = dateFormat9.format(TimeStamp.getCurrentTime().getDate().toInstant());


        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(dateFormat3.format(new Date(System.currentTimeMillis())));


        System.out.println("+++++++");
        LocalDate date = LocalDate.now();
        System.out.println("当前日期" + date);
        LocalTime time = LocalTime.now();
        System.out.println("当前时间" + time);
        System.setProperty("user.timezone", "UTC");
//        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.plusHours(2));
        System.out.println("+++++++");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(new Date(System.currentTimeMillis())));
        System.setProperty("user.timezone", "UTC");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(new Date(System.currentTimeMillis())));

        String domain = "www.问好.com";
        String lowCaseDomain = domain.toLowerCase();
        String unicodeDomain = IDN.toUnicode(lowCaseDomain);
        String asciiDomain = IDN.toASCII(lowCaseDomain);

        test_1("0");
        test_1("1","2","3");
        String[] s = new String[1];
        test_1(s);
        switch (2){
            case 0:
                System.out.println(0);
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(3);
                break;
            default:
                System.out.println("II");
        }
        InetAddress[] addrs = InetAddress.getAllByName("www.baidu.com");
        System.out.println(roundUp(1123.567,2));
        System.out.println(Math.max(123.0,3));
    }
    public static int roundUp(double number,int index){
        Assert.isTrue(index>0,"参数非法");
        int result = 0,v = new Double(number).intValue();
        result = (v/(int) Math.pow(10,index)+1)*(int) Math.pow(10,index);
        return result;
    }
    public static void test_1(String... args){
        System.out.println(args);
    }
}
