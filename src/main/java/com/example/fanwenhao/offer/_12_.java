package com.example.fanwenhao.offer;

public class _12_ {
    public boolean exist(char[][] board, String word) {
        if (word.length() == 0) {
            return false;
        }
        for (int i = 0; i < board.length ; i ++) {
            for (int j = 0; j < board[0].length; j ++) {
                if (exist(board, i, j, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] board, int row, int cel, String word) {
        if (word.length() == 0) {
            return true;
        }
        if (row < 0 || row >= board.length || cel < 0 || cel >= board[0].length) {
            return false;
        }
        if (board[row][cel] != word.charAt(0)) {
            return false;
        }
        char c = board[row][cel];
        board[row][cel] = '\0';
        word = word.substring(1);
        boolean result = exist(board, row - 1, cel, word)
                || exist(board, row + 1, cel, word)
                || exist(board, row, cel - 1, word)
                || exist(board, row, cel + 1, word);
        board[row][cel] = c;
        System.out.println(word);
        return result;
    }
}
