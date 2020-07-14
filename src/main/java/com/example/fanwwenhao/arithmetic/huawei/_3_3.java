package com.example.fanwwenhao.arithmetic.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2020/7/14 16:14
 * @Version 1.0
 */
public class _3_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = bf.readLine())!=null){
            String sub = bf.readLine();
            int result = 0;
            for (int i=0;i<input.length();i++){
                if(input.charAt(i) == ' ')continue;
                int index = i;
                for (int j=0;j<sub.length();j++){
                    if(input.charAt(index) == ' '){
                        index++;
                        j--;
                    }
                    else if(input.charAt(index) != sub.charAt(j))break;
                    else if(j==sub.length()-1)result++;
                    else index++;
                }
            }
            System.out.println(result);
        }
    }
}
