package com.example.fanwenhao.offer;

public class _10_ {
    public int calculate(int n){
        if(n<=0)return 0;
        if (n==1)return 1;
        //
        int pre1=1,pre2=0,result=0;
        for (int i=2;i<=n;i++){
            result=pre1+pre2;
            pre2=pre1;
            pre1=result;
        }
        return result;
    }
}
