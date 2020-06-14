package com.example.fanwwenhao.arithmetic.offer;

public class _13_ {
    static int[][] direction = {{-1,0},{1,0},{0,-1},{0,1}};
    static int count = 0;
    public int movingCount(int m, int n, int k) {
        boolean visit[][] = new boolean[m][n];
        doMovingCount(0,0,m-1,n-1,k,visit);
        return count;
    }
    public void doMovingCount(int startX,int startY,int m, int n, int k, boolean[][] visit) {
        if(sum(startX,startY) > k)return ;
        visit[startX][startY] = true;
        count++;
        for (int i=0;i<4;i++){
            int x = startX+direction[i][0];
            int y = startY+direction[i][1];
            if(isValid(x,y,m,n)  && visit[x][y] == false ){
                doMovingCount(x,y,m,n,k,visit);
            }
        }
    }
    private boolean isValid(int i,int j,int m,int n){
        return i>=0 && j>=0 && i<=m && j<=n;
    }
    private int sum(int i,int j){
        int s = 0;
        while (true){
            s = s+i%10;
            i = i/10;
            s = s + j%10;
            j= j/10;
            if(i == 0 && j == 0)break;
        }
        return s;
    }

    public static void main(String[] args) {
        //System.out.println(new _13_().sum(19, 34));
        System.out.println(new _13_().movingCount(3,2,17 ));
    }
}
