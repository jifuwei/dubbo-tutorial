package com.jifuwei.pc;

import com.jifuwei.user.IPCUserSearchService;
import com.jifuwei.user.IUserSearchService;

import java.util.List;

/**
 * 服务中转方
 * Created by jifuwei on 2017/6/21.
 */
public class UserSearchServiceImpl implements IPCUserSearchService {

    private IUserSearchService userSearchService;

    public IUserSearchService getUserSearchService() {
        return userSearchService;
    }

    public void setUserSearchService(IUserSearchService userSearchService) {
        this.userSearchService = userSearchService;
    }

    public List<String> listUser() {
        List<String> names = userSearchService.listUser();
        names.add("666");
        return names;
    }
}
