package com.example.fanwwenhao;

import org.springframework.util.Assert;

/**
 * @Date 2020/7/9 16:09
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(roundUp(1123.567,2));
        System.out.println(Math.max(123.0,3));
    }
    public static int roundUp(double number,int index){
        Assert.isTrue(index>0,"参数非法");
        int result = 0,v = new Double(number).intValue();
        result = (v/(int) Math.pow(10,index)+1)*(int) Math.pow(10,index);
        return result;
    }
}
