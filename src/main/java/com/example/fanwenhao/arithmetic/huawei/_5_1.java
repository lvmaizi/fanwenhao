package com.example.fanwenhao.arithmetic.huawei;

/**
 * @Date 2020/7/23 16:25
 * @Version 1.0
 */

/**
 * 1
 * 11
 * 111
 */
public class _5_1 {
    public static void main(String[] args) {
        int input = 100;
        int a = 0;
        for (int i=1;i<=input;i++){
            if (check(i))a++;
        }
        System.out.println(input - a);
    }
    //检查数字里是否有7
    private static boolean check(int a){
        while (a != 0){
            if(a%10 == 7)return true;
            a = a/10;
        }
        return false;
    };
}
