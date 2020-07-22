package com.example.fanwwenhao.arithmetic.leedCode;
/**
 * @Date 2020/5/20 11:58
 * @Version 1.0
 */
public class _13_ {
    public int romanToInt(String s) {
        int rs = 0,i=1;
        int pre = getNum(s.charAt(0));
        while (i<s.length()){
            int n = getNum(s.charAt(i++));
            if(n<=pre){
                rs = rs + pre;
            }else rs = rs - pre;
            pre = n;
        }
        rs = rs + pre;
        return rs;
    }
    int getNum(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;

        }
        return 0;
    }
}
