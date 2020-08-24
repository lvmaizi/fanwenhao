package com.example.fanwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Date 2020/6/18 16:13
 * @Version 1.0
 */
public class _51_ {
    List<List<String>> result;
    //当前行是否被占用
    int[] row;
    //当前列是否被占用
    int[] cell;
    // / 这个斜线是否被占用
    int [] a;
    // \这个斜线是否被占用
    int [] b;
    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList(n);
        //当前行是否被占用
        row = new int[n];
        //当前列是否被占用
        cell = new int[n];
        // / 这个斜线是否被占用
        a = new int[2*n-1];
        // \这个斜线是否被占用
        b = new int[2*n-1];
        solveNQueens(0,n,new LinkedList());
        return result;
    }
    public void solveNQueens(int start,int n,List record){
        if(start >= n){
            List list = new ArrayList(record);
            result.add(list);
            return;
        }
        char[] s = generate(n);
        for (int i=0;i<n;i++){
            if(isValid(start,i,n)){
                s[i] = 'Q';
                record.add(String.valueOf(s));
                put(start,i,n);
                solveNQueens(start+1,n,record);
                s[i] = '.';
                remove(start,i,n);
                record.remove(record.size()-1);
            }
        }
    }
    public char[]  generate(int n){
        char[] s = new char[n];
        for (int i=0;i<n;i++){
            s[i]='.';
        }
        return s;
    }
    //在start-n放皇后 存储历史行皇后放的位置
//    public void solveNQueens(int start,int n,List history){
//        if(start>=n){
//            //皇后放置结束，
//            result.add(generate(history));
//            return;
//        }
//        for (int i=0;i<n;i++){
//            if (isValid(start,i,n)){
//                history.add(i);
//                put(start,i,n);
//                solveNQueens(start+1,n,history);
//                history.remove(history.size()-1);
//                remove(start,i,n);
//            }
//        }
//        return;
//    }
    //是否允许放入
    public boolean isValid(int i,int j,int n){
        return row[i] == 0
                && cell[j] == 0
                && a[i+j] == 0
                && b[(i-j)+n-1] == 0;
    }
    //设置放入标志
    public void put(int i,int j,int n){
        row[i]=1;
        cell[j]=1;
        a[i+j]=1;
        b[(i-j)+n-1]=1;
    }
    //设置取消标志
    public void remove(int i,int j,int n){
        row[i]=0;
        cell[j]=0;
        a[i+j]=0;
        b[(i-j)+n-1]=0;
    }

//    public List<String> generate(List<Integer> list){
//        List<String> result = new ArrayList<>(list.size());
//        for (int i=0;i<list.size();i++){
//            StringBuffer stringBuffer = new StringBuffer();
//            for (int j=0;j<list.size();j++){
//                if (j == list.get(i)){
//                    stringBuffer.append("Q");
//                }else stringBuffer.append(".");
//            }
//            result.add(stringBuffer.toString());
//        }
//        return result;
//    }
    public static void main(String[] args) {
        new _51_().solveNQueens(4);
        System.out.println();
    }
}
