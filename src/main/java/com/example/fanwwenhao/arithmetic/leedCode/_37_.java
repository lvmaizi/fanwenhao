package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.HashSet;
import java.util.Set;

public class _37_ {
    public void solveSudoku(char[][] board) {


    }
    boolean[][] rowFill = new boolean[9][9];
    boolean[][] cellFill = new boolean[9][9];
    boolean[][] geFill = new boolean[9][9];
    public boolean solveSudoku1(char[][] board,int i,int j){
        if(i == 9)return true;
        if(board[i][j] == '.'){
            for (char a = '1';a <= '9'; a++){
                int num = a - '0';
                if(!rowFill[i][num] && !cellFill[j][num] && !geFill[(i/3)*3+(j/3)][num]){
                    board[i][j] = a;
                    if(j == 8){
                        if(solveSudoku1(board,i+1,0))return true;
                    }else {
                        if(solveSudoku1(board,i,j+1))return true;
                    }
                }
            }
            board[i][j] = '.';
            return false;
        }else {
            int num = board[i][j] - '0';
            rowFill[i][num] = true;
            cellFill[j][num] = true;
            geFill[(i/3)*3+(j/3)][num] = true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println((int)'2');
        new _37_().solveSudoku(new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        });
    }
}
