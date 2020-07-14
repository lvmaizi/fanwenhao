package com.example.fanwwenhao.arithmetic.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2020/7/14 15:49
 * @Version 1.0
 */
public class _3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = bf.readLine())!=null){
            String[] inputs = input.split(" ");
            String str = inputs[0];
            Integer index = Integer.parseInt(inputs[1]);
            int[] a = new int[52];
            for (char c:str.toCharArray()){
                if(c >= 'A' && c<= 'Z'){
                    a[c-'A'] = ++a[c-'A'];
                }else {
                    a[c-'a'+26] = ++a[c-'a'+26];
                }
            }
            int de = '0';
            for (int i=0;i<52;i++){
                if(index<=a[i]){
                    de = i;break;
                }else {index-=a[i];};
            }
            char d = (char) (de >25?'a'+(de-26):'A'+de);
            for (int i=0;i<str.length();i++){
                if(d == str.charAt(i)){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
