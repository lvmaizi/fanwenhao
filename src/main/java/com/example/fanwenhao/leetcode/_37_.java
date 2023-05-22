package com.example.fanwenhao.leetcode;

import java.util.Arrays;

public class _37_ {
    private char[][] result;
    public void solveSudoku(char[][] board) {
        result = board;
        char[][] copy = Arrays.stream(board).map(char[]::clone).toArray(char[][]::new);
        dfs(copy, 0, 0);
    }

    private void dfs(char[][] board, int x, int y) {
        if (board.length == x) {
            for (int i = 0 ; i < board.length; i ++) {
                System.arraycopy(board[i], 0, result[i], 0, 9);
            }
            return;
        }
        if (board[x][y] != '.') {
            if (y == board[0].length - 1) {
                x = x + 1;
                y = 0;
            } else {
                y = y + 1;
            }
            dfs(board, x, y);
            return;
        }
        for (char c = '1'; c <= '9'; c++) {
            if (store(board, x, y, c)) {
                board[x][y] = c;
                int newX, newY;
                if (y == board[0].length - 1) {
                    newX = x + 1;
                    newY = 0;
                } else {
                    newX = x;
                    newY = y + 1;
                }
                dfs(board, newX, newY);
                board[x][y] = '.';
            }
        }
    }

    private boolean store(char[][] board, int x, int y, char c) {
        for (int i = 0; i < board[0].length; i ++) {
            if (board[x][i] == c) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i ++) {
            if (board[i][y] == c) {
                return false;
            }
        }
        int a = (x / 3) * 3;
        int b = (y / 3) * 3;
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                if (board[a + i][b + j] == c) {
                    return false;
                }
            }
        }
        return true;
    }
}
