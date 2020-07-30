package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2020/7/30 14:06
 * @Version 1.0
 */
public class _119_ {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        for (int i = 0;i <= rowIndex; i++){
            if(i == 0){
                post.add(1);
            }else if(i == 1){
                post.add(1);
                post.add(1);
            }else {
                post.add(1);
                for (int j = 1;j < pre.size(); j++){
                    post.add(pre.get(j-1)+pre.get(j));
                }
                post.add(1);
            }
            List tmp = pre;
            pre = post;
            post = tmp;
            post.clear();
        }
        return pre;
    }
}
