package com.example.fanwwenhao.arithmetic.offer;

public class _14_ {
    public int cuttingRope(int n) {
        int[] result = new int[n+1];
        result[1] = 1;
        for (int i=2;i<=n;i++){
            int max = 0;
            for (int j=1;j<=i;j++)
                max = Math.max(max,Math.max(j*(i-j)%1000000007,j*result[i-j]%1000000007));

            result[i] = max%1000000007;
        }
        return result[n];
    }

    public static void main(String[] args) {
        System.out.println(new _14_().cuttingRope(8));
    }
}
