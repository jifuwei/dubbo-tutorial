package com.jifuwei.provider;

import com.jifuwei.user.IUserService;

/**
 * 服务提供方
 * Created by jifuwei on 2017/6/20.
 */
public class UserServiceImpl implements IUserService {

    @Override
    public String getUserName() {
        return "JFW";
    }
}
