package com.example.fanwenhao.arithmetic.leedCode;

import java.util.Arrays;

/**
 * @Date 2020/4/21 16:03
 * @Version 1.0
 */
public class _279_ {
    /**
     * 记忆化搜索
     * 状态 求fn的最小评方数
     * 状态转移方程 fm = min(i平方+f(m-i评方) + i+1平方+f((m-(m-i评方))))
     * @param n
     * @return
     */
    int result[];
    public int numSquares(int n) {
        result = new int[n];
        Arrays.fill(result,-1);
        return numSquares1(n);
    }
    public int numSquares1(int n) {
        if(n<=0)return 0;
        if(result[n-1]!=-1)return result[n-1];
        for (int i=1;i*i<=n;i++){
            //tmp 表示状态转移后的fm
            int tmp = numSquares1(n-i*i);
            if(tmp!=-1){
                result[n-1] = result[n-1] == -1? 1+tmp:Math.min(result[n-1],1+tmp);
            }
        }
        return result[n-1];
    }

    /**
     * 动态规划
     */
    public int numSquares2(int n) {
        result = new int[n+1];
        Arrays.fill(result,-1);
        //状态转移，从f1计算到fn
        result[0]=0;
        for(int i=1;i<=n;i++){
            //从记忆数据计算fi
            for (int j=1;j*j<=i;j++){
                if(result[i-j*j]>0){
                    result[i] =  result[i]==-1?1+result[i-j*j]:Math.min(result[i],1+result[i-j*j]);
                }else if(i==j*j)result[i]=1;
            }
            if(result[i]==-1)result[i]=0;
        }
        return result[n];
    }

    public static void main(String[] args) {

        System.out.println(new _279_().numSquares2(12));
    }
}
