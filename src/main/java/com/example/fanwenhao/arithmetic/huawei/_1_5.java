package com.example.fanwenhao.arithmetic.huawei;

/**
 * @Date 2020/7/22 15:08
 * @Version 1.0
 */
public class _1_5 {
    public static void main(String[] args) {
        String str = "0,3 1,3 3,5 3,6";
        int[] tmp = new int[20001];
        String[] s = str.split(" ");
        for (int i=0;i<s.length;i++){
            String[] a = s[i].split(",");
            for (int j=Integer.parseInt(a[0]);j<=Integer.parseInt(a[1]);j++){
                tmp[j+10000]++;
            }
        }
        //取出区间
        int start=0;
        boolean flag = false;
        for (int i=0;i<=20000;i++){
            if(tmp[i]>1 && flag==false){
                flag = true;
                start=i;
            }
            if(tmp[i]<2 && flag == true){
                flag = false;
                System.out.println(start-10000+" "+(i-1-10000));
            }
        }
    }
}
