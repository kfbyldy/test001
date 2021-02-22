package com.ldy;

import org.apache.dubbo.demo.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.apache.dubbo.demo.DemoService;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        GreetingService greetingService = context.getBean("greetingService",GreetingService.class); // 获取远程服务代理
        String hello = greetingService.hello(); // 执行远程方法
        System.out.println( hello); // 显示调用结果
    }
}
