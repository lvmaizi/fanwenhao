package com.example.fanwenhao.arithmetic.huawei;

/**
 * @Date 2020/7/22 16:26
 * @Version 1.0
 */
//连续数列
public class _1_8 {
    public static void main(String[] args) {
        int sum = 525;
        int num = 6;
        System.out.println(sum%num);
        int start = 0;
        if(num%2==0){
            //偶数
            if(sum%num != num/2)return;
            start = sum/num - num/2+1;
        }else {
            //奇数
            if(sum%num != 0)return;
            start = sum/num - num/2;
        }
        for (int i=start;i<=num+start-1;i++){
            System.out.print(i+" ");
        }
    }
}
