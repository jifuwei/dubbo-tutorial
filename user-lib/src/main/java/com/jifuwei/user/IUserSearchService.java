package com.jifuwei.user;

import java.util.List;

/**
 * dubbo对外暴露接口,共提供方和消费方使用
 * Created by jifuwei on 2017/6/21.
 */
public interface IUserSearchService {
    List<String> listUser();
}
