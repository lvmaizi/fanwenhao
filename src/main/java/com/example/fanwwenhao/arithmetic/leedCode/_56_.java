package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Date 2020/7/23 14:36
 * @Version 1.0
 */
public class _56_ {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {1,2},
                {4,5},
                {3,4}
        };
        Arrays.sort(a,(c,b)->{
            return c[0]-b[0];
        });
        System.out.println(new _56_().merge(a));
    }
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)return new int[0][];
        Arrays.sort(intervals,(c,b)->{
            return c[0]-b[0];
        });
        int[][] res = new int[intervals.length][];
        int index = 0;
        int i = 0;
        while(i < intervals.length){
            int[] item = intervals[i++];
            while (i < intervals.length){
                if(item[1] >= intervals[i][0]){//合并
                    item[1] = Math.max(intervals[i][1],item[1]);
                    i++;
                }else break;
            }
            res[index++] = item;
        }
        for (int j = 0;j < res.length; j++){
            if(res[j] == null){
                res = Arrays.copyOf(res,j);
                break;
            }
        }
        return res;
    }
}
