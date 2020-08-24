package com.example.fanwenhao.arithmetic.huawei;

/**
 * @Date 2020/7/15 13:28
 * @Version 1.0
 */
public class _3_7 {
    public static void main(String[] args) {
        String str = "6525441";
        int k = 4;
        for (int i=0;i<k;i++){
            for (int j=0;j<str.length()-1;j++){
                if((int)str.charAt(j)>(int)str.charAt(j+1)){
                    String pre = j!=0?str.substring(0,j):"";
                    String post = j!=str.length()-1?str.substring(j+1,str.length()):"";
                    str = pre+post;
                    break;
                }
                if(j==str.length()-2){
                    str = str.substring(0,str.length()-1);
                }
            }
        }
        System.out.println(str);
    }
}
