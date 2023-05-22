package com.example.fanwenhao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _130_ {

    public static void main(String[] args) {
        _130_ test = new _130_();
        test.solve(new char[][] {{'O','O','O','O'},{'O','O','O','O'},{'O','O','O','O'},{'O','O','O','O'}});
    }

    public void solve(char[][] board) {
        boolean[][] used = new boolean[board.length][board[0].length];
        for (int i = 0; i < board[0].length; i ++) {
            dfs(board, 0, i, used);
            dfs(board, board.length - 1, i, used);
        }
        for (int j = 0; j < board.length; j ++) {
            dfs(board, j, 0, used);
            dfs(board, j, board[0].length - 1, used);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j< board[0].length; j++) {
                if (board[i][j] == 'O' && !used[i][j]) {
                    board[i][j] = 'X';
                }
            }
         }
    }

    private int[][] f = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private void dfs(char[][] board, int x, int y, boolean[][] used) {
        if (board[x][y] == 'X') {
            return;
        }
        if (used[x][y]) {
            return;
        }
        used[x][y] = true;
        for (int[] ints : f) {
            int newX = ints[0] + x;
            int newY = ints[1] + y;
            if (area(newX,newY,board.length-1,board[0].length-1) && board[newX][newY] == 'O' && !used[x][y]) {
                dfs(board, newX, newY, used);
            }
        }

    }

    private boolean area(int newX, int newY, int length, int length1) {
        return newX >= 0 && newY >= 0 && newX <= length && newY <= length1;
    }

}
