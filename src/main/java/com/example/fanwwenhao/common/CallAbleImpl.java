package com.example.fanwwenhao.common;

import java.util.concurrent.Callable;

/**
 * @Date 2019/12/11 19:27
 * @Version 1.0
 */
public class CallAbleImpl<V> implements Callable {
    @Override
    public V call() throws Exception {
        throw new Exception();
    };
}
