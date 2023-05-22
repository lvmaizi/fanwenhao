package com.example.fanwenhao.offer;

public class _13_ {
    int k = 0;
    int[][] arr = new int[][] {{0, 1}, {0, -1}, {1,0 }, {-1, 0}};
    public int movingCount(int m, int n, int k) {
        this.k = k;
        boolean[][] used = new boolean[m][n];
        return dfs(m, n, 0, 0, used);
    }

    private int dfs(int m, int n, int row, int cell, boolean[][] used) {
        if (row < 0 || row >= m || cell < 0 || cell >= n) {
            return 0;
        }
        if (used[row][cell]) {
            return 0;
        }
        if (!isAllow(row,cell, k)) {
            return 0;
        }

//        System.out.println(length + "--" + max + "+" + row + "+" + cell);
        used[row][cell] = true;
        int result = 1;
        for (int[] a : arr) {
            result =  result + dfs(m, n, row + a[0], cell + a[1], used);
        }
        return result;
    }

    private boolean isAllow(int row, int cel, int k) {
        int sum = 0;
        while (row > 0) {
            sum = sum + row % 10;
            row = row / 10;
        }
        while (cel > 0) {
            sum = sum + cel % 10;
            cel = cel / 10;
        }
        return sum <= k;
    }
}
