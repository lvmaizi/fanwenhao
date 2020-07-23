package com.example.fanwwenhao.arithmetic.huawei;

/**
 * @Date 2020/7/23 16:42
 * @Version 1.0
 */
public class _5_2 {
    public static void main(String[] args) {
        String str = "";
        String p = "";
        int rs = -1;
        c:
        for (int i=0; i<=str.length()-p.length();i++){
            for (int j=0; j<p.length();j++){
                if(str.charAt(i) != p.charAt(j))break;
                if(j == p.length()-1){
                    rs = i;
                    break c;
                }
            }
        }
        System.out.println(rs);
    }
}
