package com.example.fanwwenhao.arithmetic.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * @Date 2020/7/17 14:42
 * @Version 1.0
 */
public class HJ97 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bf.readLine())!=null){
            int fu = 0,sum = 0,z = 0;
            String[] inputs = bf.readLine().split(" ");
            for (int i=0;i<inputs.length;i++){
                if(Integer.parseInt(inputs[i])<0){
                    fu++;
                }else if(Integer.parseInt(inputs[i])>0){
                    sum = sum + Integer.parseInt(inputs[i]);
                    z++;
                }
            }
            System.out.println(String.valueOf(fu)+ " "+  Math.round(sum * 10.0/z)/10.0);

            System.out.println(fu+ " "+new BigDecimal(sum).divide(new BigDecimal(z)));
        }
    }
}
