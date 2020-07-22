package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/21 13:53
 * @Version 1.0
 */
public class _8_ {
    public int myAtoi(String str) {
//        System.out.println(Integer.MAX_VALUE+ " "+Integer.MIN_VALUE);
//        Integer.parseInt("-91474836466");
//        Integer.parseInt("-100");
//        Integer.parseInt("+100");

        int rs = 0;
        boolean negative = false;
        int limit = -Integer.MAX_VALUE;
        int i=0;
        for (;i<str.length();i++){
            if(str.charAt(i) == '-'){
                negative = true;
                limit = Integer.MIN_VALUE;
                i++;
                break;
            }
            if(str.charAt(i)>'0' && str.charAt(i)<='9')break;
            if(str.charAt(i) != '+' && str.charAt(i)!=' ' && str.charAt(i)!='0')return 0;
        }
        for (;i<str.length();i++){
            if (str.charAt(i)<'0' || str.charAt(i)>'9')break;
            int digit = Character.digit(str.charAt(i),10);
            if(rs*10<limit+digit || rs<limit/10){
                rs = limit;break;
            }
            rs = (rs*10)-digit;
        }
        return negative?rs:-rs;
    }

    public static void main(String[] args) {
        System.out.println(new _8_().myAtoi("  -91474836466 g"));
    }
}
