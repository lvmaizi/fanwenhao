package com.example.fanwenhao.arithmetic.huawei;

/**
 * @Date 2020/7/22 17:17
 * @Version 1.0
 */
public class _1_10 {
    public static void main(String[] args) {
        String str = "11001,11110";
        String[] s = str.split(",");
        int[] rs = new int[5];
        for (String item:s){
            for (int i=0;i<item.length();i++){
                rs[i] += Integer.parseInt(String.valueOf(item.charAt(i)));
            }
        }
        int min = rs[0];
        for (int a:rs){
            if(min>a)min = a;
        }
        System.out.println(min);
    }
}
