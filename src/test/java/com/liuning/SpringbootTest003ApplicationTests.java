package com.liuning;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringbootTest003ApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
//        Object o = redisTemplate.opsForValue().get("1");
        System.out.println(1);
    }
//    public static void main(String[] args) throws Exception {
//        //创建连接工厂
//        ConnectionFactory connectionFactory = new ConnectionFactory();
//        //主机地址
//        connectionFactory.setHost("192.168.10.105");
//        //连接端口;默认为 5672
//        connectionFactory.setPort(5672);
//        //虚拟主机名称;默认为 /
//        connectionFactory.setVirtualHost("/");
//        //连接用户名；默认为guest
//        connectionFactory.setUsername("admin");
//        //连接密码；默认为guest
//        connectionFactory.setPassword("admin");
//
//        //创建连接
//        Connection connection = connectionFactory.newConnection();
//
//        //创建频道
//        Channel channel = connection.createChannel();
//
//        // 声明（创建）队列
//        /**
//         * queue      参数1：队列名称
//         * durable    参数2：是否定义持久化队列,当mq重启之后,还在
//         * exclusive  参数3：是否独占本次连接
//         *            ① 是否独占,只能有一个消费者监听这个队列
//         *            ② 当connection关闭时,是否删除队列
//         * autoDelete 参数4：是否在不使用的时候自动删除队列,当没有consumer时,自动删除
//         * arguments  参数5：队列其它参数
//         */
//        channel.queueDeclare("simple_queue1", true, false, false, null);
//
//        // 要发送的信息
//        String message = "你好；小兔子！111";
//        /**
//         * 参数1：交换机名称,如果没有指定则使用默认Default Exchage
//         * 参数2：路由key,简单模式可以传递队列名称
//         * 参数3：配置信息
//         * 参数4：消息内容
//         */
//        channel.basicPublish("", "simple_queue1", null, message.getBytes());
//        System.out.println("已发送消息：" + message);
//
//        // 关闭资源
//        channel.close();
//        connection.close();
//    }

}
