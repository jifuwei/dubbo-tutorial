package com.jifuwei.consumer;

import com.alibaba.fastjson.JSON;
import com.jifuwei.user.IPCUserSearchService;
import com.jifuwei.user.IUserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 服务发现者测试
 * Created by jifuwei on 2017/6/20.
 */
public class UserServiceImplTest {

    @Test
    public void user() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application.xml"});
        context.start();
        IUserService userService = (IUserService) context.getBean("iUserService");
        IPCUserSearchService pcUserSearchService = (IPCUserSearchService) context.getBean("iPCUserSearchService");
        System.out.println(userService.getUserName());
        System.out.println("-----------------------------------------");
        System.out.println(JSON.toJSONString(pcUserSearchService.listUser()));

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
