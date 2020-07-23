package com.example.fanwwenhao.arithmetic.huawei;

public class _5_10 {
    public static void main(String[] args) {
        int input = 99;
        int sum = 0;
        for (int i=1;i<input;i++){
            if(i%2 == 0){//偶数个
                if((input*2/i)*(i/2)==input){
                    sum++;
                }
            }else {//奇数个
                if((input%i)*i == input){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
