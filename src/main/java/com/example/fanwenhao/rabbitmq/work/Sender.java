package com.example.fanwenhao.rabbitmq.work;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Date 2020/7/28 15:13
 * @Version 1.0
 */
public class Sender {
    //声明队列
    private static final String QUEUE ="queueF";
    public static void main(String[] args) {
        Connection connection = null;
        Channel channel = null;
        try {
            ConnectionFactory connectionFactory = new ConnectionFactory();
            connectionFactory.setHost("172.16.10.101");//mq服务ip地址
            connectionFactory.setPort(5672);//mq client连接端口
            connectionFactory.setUsername("kyoto");//mq登录用户名
            connectionFactory.setPassword("kyoto@12345");//mq登录密码
            connectionFactory.setVirtualHost("kyoto");//rabbitmq默认虚拟机名称为“/”，虚拟机相当于一个独立的mq服务器
            //创建与RabbitMQ服务的TCP连接
            connection = connectionFactory.newConnection();
            //创建与Exchange的通道，每个连接可以创建多个通道，每个通道代表一个会话任务
            channel = connection.createChannel();

            //通道绑定队列
            /**
             * 声明队列，如果Rabbit中没有此队列将自动创建
             * param1:队列名称
             * param2:是否持久化
             * param3:队列是否独占此连接
             * param4:队列不再使用时是否自动删除此队列
             * param5:队列参数
             * String queue, boolean durable, boolean exclusive, boolean autoDelete, Map<String, Object> arguments
             *
             */
            channel.queueDeclare(QUEUE,true,false,false,null);//通道绑定邮件队列

            for(int i = 0;i<1000;i++){
                String message = new String("mq 发送消息。。。");
                /**
                 * 消息发布方法
                 * param1：Exchange的名称，如果没有指定，则使用Default Exchange
                 * param2:routingKey,消息的路由Key，是用于Exchange（交换机）将消息转发到指定的消息队列
                 * param3:消息包含的属性
                 * param4：消息体
                 * 这里没有指定交换机，消息将发送给默认交换机，每个队列也会绑定那个默认的交换机，但是不能显示绑定或解除绑定
                 * 默认的交换机，routingKey等于队列名称
                 */
                //String exchange, String routingKey, BasicProperties props, byte[] body
                channel.basicPublish("",QUEUE,null,message.getBytes("utf-8"));
                System.out.println("mq消息发送成功！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                channel.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
