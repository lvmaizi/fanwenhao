package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/5/21 13:56
 * @Version 1.0
 */
public class _38_ {
    public String countAndSay(int n) {
        String str = "1";
        String next = "";
        for (int i=2;i<=n;i++){
            int k = 0,sum = 0;
            for (int j=0;j<str.length();j++){
                if(str.charAt(k)==str.charAt(j))sum++;
                else {
                    next = next + sum + str.charAt(k);
                    k=j;
                    sum=1;
                }
                if(j==str.length()-1)next = next + sum + str.charAt(k);
            }
            str = next;
            next = "";
        }
        return str;
    }

    public static void main(String[] args) {
        new _38_().countAndSay(5);
    }
}
