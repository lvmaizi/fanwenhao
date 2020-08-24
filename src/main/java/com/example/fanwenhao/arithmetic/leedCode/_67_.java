package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/23 15:39
 * @Version 1.0
 */
public class _67_ {
    public String addBinary(String a, String b) {
        String max = a.length()>b.length()?a:b;
        String min = a.length()>b.length()?b:a;
        String fill = "";
        for (int i=0;i<max.length()-min.length();i++){
            fill += "0";
        }
        min = fill + min;
        String result = "";
        //是否进1
        int flag = 0;
        for (int i = min.length()-1;i>=0; i--){
            int sum = Integer.parseInt(String.valueOf(min.charAt(i)))
                    + Integer.parseInt(String.valueOf(max.charAt(i)))
                    + flag;
            int mod = sum % 2;
            int s = sum / 2;
            result = mod + result;
            if(s == 1)flag = 1;
            else flag = 0;
        }
        if (flag == 1)return "1"+result;
        return result;
    }

    public static void main(String[] args) {
        new _67_().addBinary("1010","1011");
    }
}
