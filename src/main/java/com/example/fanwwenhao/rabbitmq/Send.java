package com.example.fanwwenhao.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Send {
    public static void main(String[] args) throws Exception {
        System.out.println(String.class.getResource("/"));
        //Thread.currentThread().getContextClassLoader().getResource
        System.out.println(Thread.currentThread().getContextClassLoader().getResource("/"));
        System.out.println(decrypt("JgD1TrIAOoHD5oAnReBWYRnjtLYZph4e/C91fo5n/GciZO+CdVx8nWjn/W7dGZEcKfPI/7xWE1CgAKzi9Sko0w==","MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAIxqU9J6SsOH6TF7ZRss1MRtGMVlWxZbKzVZbKZhDA2mrHx2BT6lz29FPJ83+M0WYBGpLUGyl4MC+PIkqEG5YwMCAwEAAQ=="));

        String exchangeName = "fwh_exchange_demo";
        String routingKey = "fwh_routingKey_demo";
        String queueName = "fwh_queue";

        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("172.16.10.101");
        connectionFactory.setVirtualHost("kyoto");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("kyoto");
        connectionFactory.setPassword("kyoto@12345");
        try{
            Connection connection = connectionFactory.newConnection();
            //创建信道
            Channel channel = connection.createChannel();
            //交换器声明
            channel.exchangeDeclare(exchangeName,"direct",true,false,null);
            //队列声明
            channel.queueDeclare("queue-demo-1",false,false,false,null);
            String message = "hello 12345";
            channel.basicPublish("","queue-demo-1",null,message.getBytes());
            System.out.println("uuu");
        }catch (Exception e){

        }
    }

    public static String decrypt(String sSrc, String sKey) throws Exception {
        try {

            if (sKey == null) {
                System.out.print("Key为空null");
                return null;
            }

            if (sKey.length() != 16) {
                System.out.print("Key长度不是16位");
                return null;
            }
            byte[] raw = sKey.getBytes("UTF-8");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec iv = new IvParameterSpec("0102030405060708".getBytes());

            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            //byte[] encrypted1 = new BASE64Decoder().decodeBuffer(sSrc);
            byte[] encrypted1 = Base64.getDecoder().decode(sSrc);

            try {
                byte[] original = cipher.doFinal(encrypted1);
                String originalString = new String(original);
                return originalString;
            } catch (Exception e) {
                return sSrc;
            }
        } catch (Exception ex) {
            return sSrc;
        }
    }
}
