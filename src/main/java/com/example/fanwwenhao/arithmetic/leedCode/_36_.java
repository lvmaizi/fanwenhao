package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Date 2020/7/28 18:01
 * @Version 1.0
 */
public class _36_ {
    public boolean isValidSudoku(char[][] board) {
        //横向检查
        for (int i = 0;i < 9;i ++){
            Set set = new HashSet();
            for (int j = 0;j < 9;j ++){
                if(set.contains(board[i][j]))return false;
                if(board[i][j] != '.')set.add(board[i][j]);
            }
        }
        //竖线
        for (int i = 0 ;i < 9 ;i ++){
            Set set = new HashSet();
            for (int j = 0;j < 9;j ++){
                if(set.contains(board[j][i]))return false;
                if(board[j][i] != '.')set.add(board[j][i]);
            }
        }
        //九宫格
        for (int k = 0;k < 9;k = k + 3){
            for (int c = 0;c < 9; c = c + 3){
                Set set = new HashSet();
                for (int i = 0;i < 3;i ++){
                    for (int j = 0;j < 3;j ++){
                        if(set.contains(board[i+k][j+c]))return false;
                        if(board[i+k][j+c] != '.')set.add(board[i+k][j+c]);
                    }
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku1(char[][] board) {
        Set[] rows = new HashSet[9];
        Set[] cells = new HashSet[9];
        Set[] sides = new HashSet[9];
        for (int i = 0;i < 9;i ++){
            rows[i] = new HashSet();
            cells[i] = new HashSet();
            sides[i] = new HashSet();
        }
        for (int i = 0;i < 9; i++){
            for (int j = 0; j < 9;j++){
                if(board[i][j] != '.')continue;
                if(rows[i].contains(board[i][j])){
                    return false;
                }else rows[i].add(board[i][j]);
                if(cells[j].contains(board[i][j])){
                    return false;
                }else cells[j].add(board[i][j]);
                int c = i/3 + (j/3)*3;
                if(sides[c].contains(board[i][j]))
                    return false;
                else sides[c].add(board[i][j]);
            }
        }
        return true;
    }
}
