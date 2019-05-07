package com.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * <p>Description:</p>
 * <p>com.dubbo</p>
 *
 * @author smartdt
 * @version 1.0
 * @date 2018/5/21
 */
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.out.println("服务方开始提供服务~~~~~");
        System.in.read();
    }
}
