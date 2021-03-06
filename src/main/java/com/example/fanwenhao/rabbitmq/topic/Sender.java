package com.example.fanwenhao.rabbitmq.topic;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Date 2020/7/28 15:54
 * @Version 1.0
 */
public class Sender {
    //声明两个队列和一个交换机
    //Topics 模式
    private static final String QUEUE_EMAIL ="queueEmail";
    private static final String QUEUE_SMS ="queueSms";
    private static final String EXCHANGE = "messageChange";
    public static void main(String[] args) {
        Connection connection = null;
        Channel channel = null;
        try {
            ConnectionFactory connectionFactory = new ConnectionFactory();
            connectionFactory.setHost("127.0.0.1");//mq服务ip地址
            connectionFactory.setPort(5672);//mq client连接端口
            connectionFactory.setUsername("guest");//mq登录用户名
            connectionFactory.setPassword("guest");//mq登录密码
            connectionFactory.setVirtualHost("/");//rabbitmq默认虚拟机名称为“/”，虚拟机相当于一个独立的mq服务器
            //创建与RabbitMQ服务的TCP连接
            connection = connectionFactory.newConnection();
            //创建与Exchange的通道，每个连接可以创建多个通道，每个通道代表一个会话任务
            channel = connection.createChannel();
            //通道绑定交换机
            /**
             * 参数明细
             * 1、交换机名称
             * 2、交换机类型，fanout、topic、direct、headers
             */
            //Topics 模式
            channel.exchangeDeclare(EXCHANGE, BuiltinExchangeType.TOPIC);
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
            channel.queueDeclare(QUEUE_EMAIL,true,false,false,null);//通道绑定邮件队列
            channel.queueDeclare(QUEUE_SMS,true,false,false,null);//通道绑定短信队列
            //交换机和队列绑定
            /**
             * 参数明细
             * 1、队列名称
             * 2、交换机名称
             * 3、路由key
             */
            channel.queueBind(QUEUE_EMAIL,EXCHANGE,"inform.#.email.#");
            channel.queueBind(QUEUE_SMS,EXCHANGE,"inform.#.sms.#");
            //给email队列发消息
            for(int i = 0;i<10;i++){
                String message = new String("mq 发送email消息。。。");
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
                channel.basicPublish(EXCHANGE,"inform.email",null,message.getBytes());
                System.out.println("mq email 消息发送成功！");
            }
            //给sms队列发消息
            for(int i = 0;i<10;i++){
                String message = new String("mq 发送sms消息。。。");
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
                channel.basicPublish(EXCHANGE,"inform.sms",null,message.getBytes());
                System.out.println("mq sms 消息发送成功！");
            }
            //给email和sms队列发消息
            for(int i = 0;i<10;i++){
                String message = new String("mq 发送email sms消息。。。");
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
                channel.basicPublish(EXCHANGE,"inform.email.sms",null,message.getBytes());
                System.out.println("mq email sms 消息发送成功！");
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
