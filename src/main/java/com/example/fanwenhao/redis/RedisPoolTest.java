package com.example.fanwenhao.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Date 2020/6/9 10:30
 * @Version 1.0
 */
public class RedisPoolTest {
    public static void main(String[] args) {
        //1 获得连接池配置对象，设置配置项
        JedisPoolConfig config = new JedisPoolConfig();
        // 1.1 最大连接数
        config.setMaxTotal(30);

        //1.2 最大空闲连接数
        config.setMaxIdle(10);

        //获得连接池
        JedisPool jedisPool = new JedisPool(config,"dev.redis-ha.yaoxinhd.io",6379);


        Jedis jedis=null;
        try {
            //3.获得核心对象
            jedis = jedisPool.getResource();
            //4.设置数据
            jedis.set("name","xinruyi");
            //5.获得数据
            String name = jedis.get("name");
            System.out.println(name);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(jedis!=null){
                jedis.close();
            }
        }

        //虚拟机关闭时，释放pool资源
        if(jedisPool!=null){
            jedisPool.close();
        }
    }
}
