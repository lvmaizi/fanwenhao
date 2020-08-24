package com.example.fanwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.List;

public class _130_ {
    public void solve(char[][] board) {
        if (board.length == 0)return;
        int x = board.length;
        int y = board[0].length;
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                if(board[i][j] == 'O'){
                    List c = new ArrayList<>();
                    visited = new boolean[x][y];
                    if(isInclude(board,i,j,c)){
                        fill(board,c);
                    }
                }
            }
        }
    }
    class Pair{
        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
        int x,y;
    }
    boolean[][] visited = null;
    public boolean isInclude(char[][] board, int i, int j, List<Pair> rs){
        if(isEdge(board,i,j))return false;
        if(board[i][j] == 'O'){
            rs.add(new Pair(i,j));
            visited[i][j] = true;
        }else return false;
        //上
        if(board[i-1][j] == 'O' && visited[i-1][j] == false && !isInclude(board,i-1,j,rs)){
            return false;
        }
        //下
        if(board[i+1][j] == 'O' && visited[i+1][j] == false && !isInclude(board,i+1,j,rs)){
            return false;
        }
        //左
        if(board[i][j-1] == 'O' && visited[i][j-1] == false && !isInclude(board,i,j-1,rs)){
            return false;
        }
        //右
        if(board[i][j+1] == 'O' && visited[i][j+1] == false && !isInclude(board,i,j+1,rs)){
            return false;
        }
        return true;
    }
    public boolean isEdge(char[][] board, int i, int j){
        return i == 0 || i == board.length-1 || j == 0 || j == board[0].length-1;
    }
    public void fill(char[][] board, List<Pair> rs){
        for (Pair i:rs) {
            board[i.x][i.y] = 'X';
        }
    }

    public static void main(String[] args) {
        new _130_().solve(new char[][]{
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        });
    }
}
