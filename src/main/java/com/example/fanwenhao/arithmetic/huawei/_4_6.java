package com.example.fanwenhao.arithmetic.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2020/7/24 11:17
 * @Version 1.0
 */
public class _4_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = bf.readLine()) != null){
            int sum = Integer.parseInt(str);
            int count = Integer.parseInt(bf.readLine());
            List<String> ls = new ArrayList<>();
            for (int i = 0;i < count;i ++){
                ls.add(bf.readLine());
            }
            System.out.println("===========");
            StringBuffer b = new StringBuffer();
            System.out.println(ls);
            System.out.println("===========");

        }
    }
}
