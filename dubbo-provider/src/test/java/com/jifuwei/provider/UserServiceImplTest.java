package com.jifuwei.provider;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 服务提供者测试
 * Created by jifuwei on 2017/6/20.
 */
public class UserServiceImplTest {
    @Test
    public void getUserName() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application.xml"});
        context.start();
        System.out.println("提供者服务已注册成功");

        try {
            System.in.read();//让此程序一直跑，表示一直提供服务
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}