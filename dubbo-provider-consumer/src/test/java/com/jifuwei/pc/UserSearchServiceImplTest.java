package com.jifuwei.pc;

import com.alibaba.fastjson.JSON;
import com.jifuwei.user.IPCUserSearchService;
import com.jifuwei.user.IUserSearchService;
import com.jifuwei.user.IUserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by jifuwei on 2017/6/21.
 */
public class UserSearchServiceImplTest {

    @Test
    public void listUser() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application.xml"});
        context.start();
        IUserSearchService userSearchService = (IUserSearchService) context.getBean("iUserSearchService");
        System.out.println(JSON.toJSONString(userSearchService.listUser()));

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}