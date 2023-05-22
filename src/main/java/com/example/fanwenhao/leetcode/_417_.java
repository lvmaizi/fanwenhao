package com.example.fanwenhao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _417_ {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        // 1:可以向左流，2右，3上，4下
        int[][] usedL = new int[heights.length][heights[0].length];
        int[][] usedR = new int[heights.length][heights[0].length];
        int[][] usedU = new int[heights.length][heights[0].length];
        int[][] usedD = new int[heights.length][heights[0].length];

        for (int i = 0; i < heights.length ; i ++) {
            for (int j = 0; j < heights[0].length; j ++) {
                dfsL(heights, i, j, usedL);
                dfsR(heights, i, j, usedR);
                dfsU(heights, i, j, usedU);
                dfsD(heights, i, j, usedD);
            }
        }
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < heights.length ; i ++) {
            for (int j = 0; j < heights[0].length; j ++) {
                if ((usedL[i][j] == 1|| usedU[i][j] == 1) && (usedR[i][j] == 1 || usedD[i][j] == 1)) {
                    List<Integer> integers = new ArrayList<>();
                    integers.add(i);
                    integers.add(j);
                    result.add(integers);
                }
            }
        }

        return result;
    }

    private void dfsD(int[][] heights, int i, int j, int[][] usedD) {
        if (i !=heights.length-1 && usedD[i+1][j] ==0) {
            dfsR(heights, i+1, j , usedD);
        }
        // 左
        if (i==heights.length-1 || (heights[i][j] >= heights[i+1][j] && usedD[i+1][j] == 1)) {
            usedD[i][j] =  1;
        } else {
            usedD[i][j] =  -1;
        }
    }

    private void dfsU(int[][] heights, int i, int j, int[][] usedU) {
        if (i !=0 && usedU[i-1][j] ==0) {
            dfsR(heights, i-1, j , usedU);
        }
        // 左
        if (i==0 || (heights[i][j] >= heights[i-1][j] && usedU[i-1][j] == 1)) {
            usedU[i][j] =  1;
        } else {
            usedU[i][j] =  -1;
        }
    }

    private void dfsR(int[][] heights, int i, int j, int[][] usedR) {
        if (j !=heights[0].length - 1 && usedR[i][j+1] ==0) {
            dfsR(heights, i, j +1, usedR);
        }
        // 左
        if (j == heights[0].length - 1 || (heights[i][j] >= heights[i][j+1] && usedR[i][j+1] == 1)) {
            usedR[i][j] =  1;
        } else {
            usedR[i][j] =  -1;
        }
    }

    private void dfsL(int[][] heights, int i, int j, int[][] usedL) {
        if (j !=0 && usedL[i][j-1] ==0) {
            dfsL(heights, i, j -1, usedL);
        }
        // 左
        if (j == 0 || (heights[i][j] >= heights[i][j-1] && usedL[i][j-1] == 1)) {
            usedL[i][j] =  1;
        } else {
            usedL[i][j] =  -1;
        }
    }



}
