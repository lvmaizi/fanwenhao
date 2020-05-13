package com.example.fanwwenhao.util;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import org.apache.hbase.thirdparty.com.google.common.hash.Funnel;
import org.apache.hbase.thirdparty.com.google.common.hash.Funnels;

/**
 * @Date 2020/5/12 14:52
 * @Version 1.0
 */
public class BloomTest {
    public static void main(String[] args) {
        // 创建布隆过滤器对象
        Funnel<Integer> funnel = Funnels.integerFunnel();
        int a = 10000;
        Funnel<CharSequence> f = Funnels.stringFunnel(Charsets.UTF_8);
//        BloomFilter.create(f,a,0.001);
//        Double.parseDouble("12");
//        System.out.println(filter.mightContain(1));
//        System.out.println(filter.mightContain(2));
//        // 将元素添加进布隆过滤器
//        filter.put(1);
//        filter.put(2);
//        System.out.println(filter.mightContain(1));
//        System.out.println(filter.mightContain(2));
    }
}
