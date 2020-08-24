package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/21 13:53
 * @Version 1.0
 */
public class _8_ {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0)return 0;
        int rs = 0,index = 0;
        //去除空格
        boolean isfu = false;
        while (index<str.length()-1 && str.charAt(index) == ' ')index ++;
        if((str.charAt(index) >= '0' && str.charAt(index) <= '9')){}
        else if(str.charAt(index) == '+')index++;
        else if(str.charAt(index) == '-'){
            index++;
            isfu = true;
        }else return 0;
        //去除0
        while (index < str.length()-1 && str.charAt(index) == '0')index++;
        int min = -Integer.MAX_VALUE;
        if(isfu)min = Integer.MIN_VALUE;
        while (index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <= '9'){
            if((min + str.charAt(index) - '0')/10 > rs){
                rs = min;
                break;
            }
            rs = rs * 10 - (str.charAt(index) - '0');
            index ++;
        }
        return isfu ? rs:-rs;
    }
    public static void main(String[] args) {
        System.out.println(new _8_().myAtoi("-91283472332"));
    }
}
