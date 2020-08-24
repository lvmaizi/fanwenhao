package com.example.fanwenhao.arithmetic.huawei;

import java.io.IOException;
import java.math.BigDecimal;

public class Ts {
    public static void main(String[] args) throws IOException {
        System.out.println(new BigDecimal(46910).divide(new BigDecimal(277),1,BigDecimal.ROUND_HALF_UP).setScale(1,BigDecimal.ROUND_HALF_UP));

    }
}
