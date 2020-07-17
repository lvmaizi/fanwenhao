package com.example.fanwwenhao.arithmetic.huawei;

/**
 * @Date 2020/7/17 17:56
 * @Version 1.0
 */

class SS {
    public int factor(int n){
        int num=1;
        while(n>0){
            num=num*(n--);
        }
        return num;
    }
    public void del(int[] num,int length,int k){
        while (k<length-1){
            num[k]=num[k+1];
            k++;
        }

    }
    public String getPermutation(int n, int k) {
        StringBuffer ans=new StringBuffer();
        int[] temp=new int[n];
        k=k-1;
        int factor=0;
        for(int i=0;i<n;i++){
            temp[i]=i+1;
        }
        for(int i=0;i<n;i++){
            factor=factor(n-i-1);
            ans.append(temp[k/factor]);
            del(temp,n-i,k/factor);
            k=k%factor;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        new SS().getPermutation(4,4);
    }
}
