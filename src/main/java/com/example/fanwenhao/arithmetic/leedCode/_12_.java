package com.example.fanwenhao.arithmetic.leedCode;

import java.util.HashMap;
import java.util.Map;

public class _12_ {
    Map<Integer,String> special = new HashMap(){
        {
            put(4,"IV");
            put(9,"IX");
            put(40,"XL");
            put(90,"XC");
            put(400,"CD");
            put(900,"CM");
        }
    };
    public String intToRoman(int num) {
        if(special.get(num) != null)return special.get(num);
        StringBuffer rs= new StringBuffer();
        int M = num / 1000;
        num = num % 1000;
        for (int i = 0;i < M;i++)rs.append("M");
        int D = num / 500;
        num = num % 500;
        for (int i = 0;i < D;i++)rs.append("D");
        int C = num / 100;
        num = num % 100;
        for (int i = 0;i < C;i++)rs.append("C");
        int L = num / 50;
        num = num % 50;
        for (int i = 0;i < L;i++)rs.append("L");
        int X = num / 10;
        num = num % 10;
        for (int i = 0;i < X;i++)rs.append("X");
        int V = num / 5;
        num = num % 5;
        for (int i = 0;i < V;i++)rs.append("V");
        int I = num / 1;
        num = num % 1;
        for (int i = 0;i < I;i++)rs.append("I");
        return rs.toString();
    }

    public static void main(String[] args) {
        System.out.println(new _12_().intToRoman(1));
    }
}
