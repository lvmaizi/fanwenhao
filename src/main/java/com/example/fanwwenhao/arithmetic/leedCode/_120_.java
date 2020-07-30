package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2020/7/30 14:21
 * @Version 1.0
 */
public class _120_ {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> dp = new ArrayList<>(triangle.get(triangle.size()-1));
        List<Integer> dpNew = new ArrayList<>();
        for (int i = triangle.size()-2; i >= 0; i--){
            List<Integer> item = triangle.get(i);
            for (int j = 0;j < item.size(); j++){
                dpNew.add(Math.min(dp.get(j),dp.get(j+1)) + item.get(j));
            }
            List tmp = dp;
            dp = dpNew;
            dpNew = tmp;
            dpNew.clear();
        }
        return dp.get(0);
    }
}
