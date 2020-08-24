package com.example.fanwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2020/7/30 13:55
 * @Version 1.0
 */
public class _118_ {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rs = new ArrayList();
        for (int i = 1;i <= numRows; i++){
            List item = new ArrayList();
            for (int j = 1;j <= i;j++){
                if(rs.size() < 2 || j == 1 || j == i){
                    item.add(1);
                }else {
                    List<Integer> l = rs.get(rs.size()-1);
                    item.add(l.get(j-1) + l.get(j-2));
                }
            }
            rs.add(item);
        }
        return rs;
    }
}
