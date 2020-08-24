package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/4/21 10:36
 * @Version 1.0
 */
public class _343_ {
    //三位最大
    int max3(int a,int b,int c){
        return Math.max(Math.max(a,b),c);
    }
    int result[];
    //记忆化搜索
    public int integerBreak(int n) {
        result = new int[n];
        System.out.println(result[0]==0);
        return integerBreak1(n);
    }
    public int integerBreak1(int n) {
        if(n<=1)return 0;
        if(result[n-1]!=0)return result[n-1];
        for(int i=1;i<n;i++){
            result[n-1] = max3(result[n-1],i*(n-i),i* integerBreak1(n-i));
        }
        return result[n-1];
    }

    //动态规划
    public int integerBreak2(int n) {
        result = new int[n];
        result[0] = 0;
        // i：表示需计算的fi
        for(int i=2;i<=n;i++){
            //j: 表示分割后的一部分fj
            for (int j=i-1;j>0;j--){
                result[i-1] = max3(result[i-1],j*(i-j),(i-j)*result[j-1]);
            }
        }
        return result[n-1];
    }

    public static void main(String[] args) {
        System.out.println("1234".substring(2,3));
//        System.out.println(new _343_().integerBreak2(5));
    }
}
