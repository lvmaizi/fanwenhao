package com.example.fanwenhao.leetcode;

import java.util.List;

public class _120_ {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> last = triangle.get(triangle.size() - 1);
        int[] tmp = new int[last.size()];
        for (int i = 0; i < last.size(); i++) {
            tmp[i] = last.get(i);
        }
        for (int i = triangle.size() - 2; i >= 0; i--) {
            List<Integer> curr = triangle.get(i);
            for (int j = 0; j < curr.size(); j ++) {
                tmp[j] = curr.get(j) + Math.min(tmp[j], tmp[j + 1]);
            }
        }
        return tmp[0];
    }
}
