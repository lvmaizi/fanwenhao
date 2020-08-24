package com.example.fanwenhao.arithmetic.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2020/7/17 11:57
 * @Version 1.0
 */
public class HJ104 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bf.readLine())!=null){
            List<String> result = new ArrayList<>();
            for (int i=0;i<Integer.parseInt(str);i++){
                String inputStr = bf.readLine();
                while (inputStr!=null && !"".equals(inputStr)){
                    if(inputStr.length()>=8){
                        result.add(inputStr.substring(0,8));
                        inputStr = inputStr.substring(8,inputStr.length());
                    }else {
                        String fill = "";
                        for (int j=0;j<8-inputStr.length();j++){
                            fill = fill + "0";
                        }
                        result.add(inputStr+fill);
                        inputStr = "";
                    }
                }
            }
            for (String s:result){
                System.out.println(s);
            }
        }
    }
}
