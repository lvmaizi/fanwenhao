package com.example.fanwwenhao.arithmetic.offer;

/**
 * @Date 2020/6/23 17:44
 * @Version 1.0
 */
public class _47_ {
    private int result;
    private int[][] a;
    //动态规划
    public int maxValue(int[][] grid) {
        if (grid.length==0)return 0;
        a = new int[grid.length][grid[0].length];
        //初始化

        for (int i=grid[0].length-1;i>=0;i--){
            for (int j=grid.length-1;j>=0;j--){
                //右
                int r = i+1>grid[0].length-1?0:a[j][i+1];
                //下
                int d = j+1>grid.length-1?0:a[j+1][i];
                a[j][i] = Math.max(r,d);
            }
        }
        return a[0][0];
    }
    //回溯
    public void maxValue(int[][] grid,int i,int j,int result) {
        if(i==grid.length-1 && j == grid[0].length-1){
            //到达最后求最大
            this.result = Math.max(result+grid[i][j],this.result);
            return ;
        }
        result+=grid[i][j];
        //向右
        if(j<grid[0].length-1){
            maxValue(grid,i,j+1,result);
        }
        //向下
        if(i<grid.length-1){
            maxValue(grid,i+1,j,result);
        }
        result-=grid[i][j];
    }

    public static void main(String[] args) {
        new _47_().maxValue(new int[][]{
                {1,2},
                {4,5}
        });
        System.out.println();
    }
}
