package com.example.fanwwenhao.rabbitmq.work;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @Date 2020/7/28 15:14
 * @Version 1.0
 */
public class Receive {
    private static final String QUEUE ="queueF";
    public static void main(String[] args) {
        Connection connection = null;
        Channel channel = null;
        try {
            ConnectionFactory connectionFactory = new ConnectionFactory();
            connectionFactory.setHost("172.16.10.101");
            connectionFactory.setPort(5672);
            connectionFactory.setUsername("kyoto");//mq登录用户名
            connectionFactory.setPassword("kyoto@12345");//mq登录密码
            connectionFactory.setVirtualHost("kyoto");//rabbitmq默认虚拟机名称为“/”，虚拟机相当于一个独立的mq服务器
            connection = connectionFactory.newConnection();
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
//                    try {
//                        TimeUnit.SECONDS.sleep(3);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println("mq收到的消息是："+msg );
                }

            };
            DefaultConsumer consumer1 = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {

                    String msg = new String(body,"utf-8");
                    System.out.println("！！！mq收到的消息是："+msg );
                }

            };
            System.out.println("消费者启动成功！");
            channel.basicConsume(QUEUE,true,consumer);
            channel.basicConsume(QUEUE,true,consumer1);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
