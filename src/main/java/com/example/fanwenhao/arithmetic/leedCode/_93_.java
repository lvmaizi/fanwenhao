package com.example.fanwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.List;

public class _93_ {
    List<String> results = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        restoreIpAddresses(s,0,3,s);
        return results;
    }

    /**
     *
     * @param s
     * @param index 新的string 最后一个点的位置(待插入的字符串起始位置)
     * @param count 当前剩余点数
     * @param newS 插入点后的string
     */
    void restoreIpAddresses(String s,int index,int count,String newS){
        //终止条件
        if(count == 0){
            results.add(newS);
            return;
        }
        //逻辑 (可以剪纸)
        for (int i=index;i<newS.length()-1;i++){
            //是否可以插点
            if(Long.valueOf(newS.substring(index+1,i+2))>255)continue;
            String tmp = new StringBuffer(newS).insert(i+1,'.').toString();
            restoreIpAddresses(s,index+2,count-1,tmp);
        }
    }

    public static void main(String[] args) {
//        System.out.println(Integer.valueOf("5525511135"));
        System.out.println(new StringBuffer("22").insert(1,'.'));
        List r = new _93_().restoreIpAddresses("25525511135");
        System.out.println();
    }
}
