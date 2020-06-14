package com.example.fanwwenhao.arithmetic.offer;

public class _12_ {
    public boolean exist(char[][] board, String word) {
        boolean[][] visit = new boolean[board.length][board[0].length];
        for (int i=0;i<board.length;i++){
            for (int j =0;j<board[0].length;j++){
                if(doFind(board,word,i,j,visit,0))return true;
            }
        }
        return false;
    }
    private boolean doFind(char[][] board, String word,int i,int j,boolean[][] visit,int index){
        if(board[i][j] != word.charAt(index))return false;
        if(index == word.length()-1)return true;
        visit[i][j]=true;
        boolean result = false;
        //上
        if(isValid(board,i-1,j) && visit[i-1][j] == false){
            result = result || doFind(board,word,i-1,j,visit,index+1);
        }
        //下
        if(isValid(board,i+1,j) && visit[i+1][j] == false){
            result = result || doFind(board,word,i+1,j,visit,index+1);
        }
        //左
        if(isValid(board,i,j-1) && visit[i][j-1] == false){
            result = result || doFind(board,word,i,j-1,visit,index+1);
        }
        //右
        if(isValid(board,i,j+1) && visit[i][j+1] == false){
            result = result || doFind(board,word,i,j+1,visit,index+1);
        }
        System.out.println(result);
        visit[i][j]=false;
        return result;
    }
    private boolean isValid(char[][] board,int i,int j){
        return i>=0 && i<=board.length-1 && j>=0 && j<=board[0].length-1;
    }

    public static void main(String[] args) {
//        char[][] board = {
//                {'a','b','c','e'},
//                {'s','f','c','s'},
//                {'a','d','e','e'}
//        };
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','E','S'},
                {'A','D','E','E'}

        };
        System.out.println(new _12_().exist(board, "ABCESEEEFS"));
    }
}
