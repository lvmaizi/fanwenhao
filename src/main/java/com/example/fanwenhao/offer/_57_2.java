package com.example.fanwenhao.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _57_2 {
    public int[][] findContinuousSequence(int target) {
        List<List<Integer>> result = new ArrayList<>();
        int i = 2;
        while (i <= target) {
            int y = target % i;
            int x = target / i;
            if (y == 0) {
                // 奇数有一个
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    list.add(j + x - (i / 2));
                }
                result.add(list);
            }
            if (i - y == y) {
                // 偶数有一个
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    list.add(j + x - (i / 2) + 1);
                }
            }
        }
        return result.stream().map(integers -> integers.stream().mapToInt(Integer::intValue).toArray()).collect(Collectors.toList()).toArray(new int[result.size()][]);
    }
}
