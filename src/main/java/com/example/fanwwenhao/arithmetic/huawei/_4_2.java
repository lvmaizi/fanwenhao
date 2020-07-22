package com.example.fanwwenhao.arithmetic.huawei;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2020/7/20 13:52
 * @Version 1.0
 */
public class _4_2 {
    public static void main(String[] args) {
        int[][] target = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] max = new int[target.length][target[0].length];
        //初始值
        max[target.length-1][target[0].length-1] = target[target.length-1][target[0].length-1];
        for (int i=target.length-1;i>=0;i--){
            for (int j = target[0].length-1;j>=0;j--){
                //右
                if(j != target[0].length-1){
                    max[i][j] = max[i][j+1]+target[i][j];
                }
                //下
                if(i != target.length-1){
                    max[i][j] = Math.max(max[i][j],max[i+1][j]+target[i][j]);
                }
            }
        }
        //寻找路径
        List list = new ArrayList();
        int i=0,j=0;
        list.add(0+","+0);
        while (i!=target.length-1 || j!=target[0].length-1){
            if(i == target.length-1){//右
                j++;
                list.add(i+","+j);
                continue;
            }
            //下
            if(j == target[0].length-1){
                i++;
                list.add(i+","+j);
                continue;
            }
            if(target[i][j+1]>target[i+1][j]){//右>下
                j++;
                list.add(i+","+j);
                continue;
            }else {
                i++;
                list.add(i+","+j);
                continue;
            }
        }
        System.out.println("最大值："+max[0][0]);
        System.out.println("路径："+list.toString());
    }
}
