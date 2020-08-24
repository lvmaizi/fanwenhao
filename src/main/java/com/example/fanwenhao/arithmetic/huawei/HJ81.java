package com.example.fanwenhao.arithmetic.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ81 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input  = null;
        while ((input = bf.readLine()) != null){
            String shortStr = input;
            String longStr = bf.readLine();
            System.out.println(isExists(shortStr,longStr));
        }
    }
    private static boolean isExists(String shortStr,String longStr){
        for (int i= 0;i < shortStr.length(); i++) {
            if(longStr.indexOf(shortStr.charAt(i)) == -1){
                return false;
            }
        }
        return true;
    }
}
