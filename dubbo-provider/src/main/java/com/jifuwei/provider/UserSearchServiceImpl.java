package com.jifuwei.provider;

import com.google.common.collect.Lists;
import com.jifuwei.user.IUserSearchService;

import java.util.List;

/**
 * 服务提供方
 * Created by jifuwei on 2017/6/21.
 */
public class UserSearchServiceImpl implements IUserSearchService {
    @Override
    public List<String> listUser() {
        List<String> names = Lists.newArrayList("zhangsan", "lisi", "wangwu");
        return names;
    }
}
