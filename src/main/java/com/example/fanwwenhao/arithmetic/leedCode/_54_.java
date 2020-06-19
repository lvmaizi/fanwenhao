package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Date 2020/6/19 11:45
 * @Version 1.0
 */
public class _54_ {
    List<Integer> result;
    //摘抄的 解决便秘的解法
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<>();
        //上下左右
        int a=0,b=matrix.length-1,c=0,d=matrix[0].length-1;
        while (true){
            //打印上行
            for (int i=c;i<=d;i++){
                result.add(matrix[a][i]);
            }
            if(a++>b)break;
            //打印右列
            for (int i=a;i<=b;i++){
                result.add(matrix[i][d]);
            }
            if(d--<c)break;
            //打印下行
            for (int i=d;i>=c;i--){
                result.add(matrix[b][i]);
            }
            if(b--<a)break;
            //打印左列
            for (int i=b;i>=a;i--){
                result.add(matrix[i][c]);
            }
            if(c++>d)break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new _54_().spiralOrder(new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        }));
    }
}
