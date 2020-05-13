package com.example.fanwwenhao;

import com.example.fanwwenhao.common.JvmTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FanwwenhaoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println(String.class.getResource("/"));
        //JvmTest.main(new String[2]);
    }

}
