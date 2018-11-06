package com.zxp.service;

import com.zxp.pojo.UserInfo;

import java.util.List;

public interface IUserService {
    List findAllUser();

    UserInfo getUserInfo(int id);
}
