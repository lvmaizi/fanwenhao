package com.example.fanwenhao.rabbitmq.header;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/**
 * @Date 2020/7/28 16:07
 * @Version 1.0
 */
public class Sender {
    //声明两个队列和一个交换机
    //Header 模式
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
            //Header 模式
            channel.exchangeDeclare(EXCHANGE, BuiltinExchangeType.HEADERS);
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
             * 4、
             * String queue, String exchange, String routingKey, Map<String, Object> arguments
             */
            Map<String,Object> headers_email = new Hashtable<String,Object>();
            headers_email.put("inform_type","email");
            Map<String,Object> headers_sms = new Hashtable<String, Object>();
            headers_sms.put("inform_type","sms");
            channel.queueBind(QUEUE_EMAIL,EXCHANGE,"",headers_email);
            channel.queueBind(QUEUE_SMS,EXCHANGE,"",headers_sms);
            //给email队列发消息
            for(int i = 0;i<10;i++){
                String message = new String("mq 发送email消息。。。");
                Map<String,Object> headers = new Hashtable<String,Object>();
                headers.put("inform_type","email");//匹配email通知消费者绑定的header
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
                AMQP.BasicProperties.Builder properties = new AMQP.BasicProperties.Builder();
                properties.headers(headers);
                //Email通知
                channel.basicPublish(EXCHANGE,"",properties.build(),message.getBytes());
                System.out.println("mq email 消息发送成功！");
            }
            //给sms队列发消息
            for(int i = 0;i<10;i++){
                String message = new String("mq 发送sms消息。。。");
                Map<String,Object> headers = new Hashtable<String,Object>();
                headers.put("inform_type","sms");//匹配sms通知消费者绑定的header
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
                AMQP.BasicProperties.Builder properties = new AMQP.BasicProperties.Builder();
                properties.headers(headers);
                //sms通知
                channel.basicPublish(EXCHANGE,"",properties.build(),message.getBytes());
                System.out.println("mq sms 消息发送成功！");
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
