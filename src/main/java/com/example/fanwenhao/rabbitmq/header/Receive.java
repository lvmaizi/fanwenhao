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
public class Receive {
    private static final String QUEUE_EMAIL ="queueEmail";
    private static final String EXCHANGE = "messageChange";
    public static void main(String[] args) {
        Connection connection = null;
        Channel channel = null;
        try {
            ConnectionFactory connectionFactory = new ConnectionFactory();
            connectionFactory.setHost("127.0.0.1");
            connectionFactory.setPort(5672);
            connection = connectionFactory.newConnection();
            channel = connection.createChannel();
            //通道绑定交换机
            /**
             * 参数明细
             * 1、交换机名称
             * 2、交换机类型，fanout、topic、direct、headers
             */
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
            headers_email.put("inform_email","email");
            channel.queueBind(QUEUE_EMAIL,EXCHANGE,"",headers_email);
            //String consumerTag, Envelope envelope, BasicProperties properties, byte[] body
            DefaultConsumer consumer = new DefaultConsumer(channel) {
                /**
                 * 消费者接收消息调用此方法
                 * @param consumerTag 消费者的标签，在channel.basicConsume()去指定
                 * @param envelope 消息包的内容，可从中获取消息id，消息routingkey，交换机，消息和重传标志
                (收到消息失败后是否需要重新发送)
                 * @param properties
                 * @param body
                 * @throws IOException
                 * String consumerTag, Envelope envelope, BasicProperties properties, byte[] body
                 */
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    //交换机
                    String exchange = envelope.getExchange();
                    //路由key
                    String routingKey = envelope.getRoutingKey();
                    envelope.getDeliveryTag();
                    String msg = new String(body,"utf-8");
                    System.out.println("mq收到的消息是："+msg );
                }

            };
            System.out.println("消费者启动成功！");
            channel.basicConsume(QUEUE_EMAIL,true,consumer);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
