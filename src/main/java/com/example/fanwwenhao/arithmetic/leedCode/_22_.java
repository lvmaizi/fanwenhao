package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2020/7/21 17:49
 * @Version 1.0
 */
public class _22_ {
    List rs = new ArrayList();
    int n;
    public List<String> generateParenthesis(int n) {
        this.n = n;
        dfs("",n,n);
        return rs;
    }
    public void dfs(String s,int l,int r){
        if(s.length()==n*2){
            rs.add(s);
            return;
        }
        //左括号
        if(l>0)dfs(s+"(",l-1,r);
        //右括号
        if(r>0 && r>l)dfs(s+")",l,r-1);
    }
}
