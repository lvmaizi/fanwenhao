package com.example.fanwenhao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _79_ {


    public boolean exist(char[][] board, String word) {
        if (word.length() ==  0) {
            return false;
        }
        List<int[]> curr = new ArrayList<>();
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[0].length; j ++) {
                if (dfs(board, i, j, curr, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int row, int cell, List<int[]> curr, String word) {
        if (word.length() == 0 ) {
            curr.forEach(ints -> System.out.println(ints[0] + "-"  + ints[1]));
            return true;
        }
        char c = word.charAt(0);
        if (board[row][cell] != c) {
            return false;
        }
        if (word.length() == 1) {
            curr.forEach(ints -> System.out.println(ints[0] + "-"  + ints[1]));
            return true;
        }
        // 向上搜索
        if (row > 0 && !isEquals(curr, row - 1, cell)) {
            curr.add(new int[]{row, cell});
            boolean result = dfs(board, row - 1, cell, curr, word.substring(1));
            curr.remove(curr.size() - 1);
            if (result) {
                return true;
            }
        }
        // 向下搜索
        if (row < board.length - 1 && !isEquals(curr, row + 1, cell)) {
            curr.add(new int[]{row, cell});
            boolean result = dfs(board, row + 1, cell, curr, word.substring(1));
            curr.remove(curr.size() - 1);
            if (result) {
                return true;
            }
        }
        // 向左搜索
        if (cell > 0 && !isEquals(curr, row, cell - 1)) {
            curr.add(new int[]{row, cell });
            boolean result = dfs(board, row, cell - 1, curr, word.substring(1));
            curr.remove(curr.size() - 1);
            if (result) {
                return true;
            }
        }
        // 向右搜索
        if (cell < board[0].length - 1 && !isEquals(curr, row , cell + 1)) {
            curr.add(new int[]{row, cell });
            boolean result = dfs(board, row , cell + 1, curr, word.substring(1));
            curr.remove(curr.size() - 1);
            if (result) {
                return true;
            }
        }
        return false;
    }

    private boolean isEquals(List<int[]> curr, int row, int cell) {

        for (int[] index : curr) {
            if (index[0] ==  row && index[1] == cell) {
                return true;
            }
        }
        return false;
    }
}
