package com.example.fanwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.List;

public class _77_ {
    List<List<Integer>> results = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        subCombine(1,n,k,new ArrayList<>());
        return results;
    }

    /**
     * 从s - n 选出 k个组合
     * @param k
     * @param comb 历史组合
     */
    void subCombine(int satrt,int end,int k,List<Integer> comb){
        if(k == 0){
            results.add(comb);
            return;
        }
        //可以剪纸
        for (int i=satrt;i<=end-k+1;i++){
            comb.add(i);
            subCombine(i+1,end,k-1,new ArrayList<>(comb));
            comb.remove(comb.size()-1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> n = new _77_().combine(4,2);
        System.out.println("");
    }
}
