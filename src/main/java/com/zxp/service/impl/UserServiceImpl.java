package com.zxp.service.impl;

import com.zxp.dao.UserInfoMapper;
import com.zxp.pojo.UserInfo;
import com.zxp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserInfoMapper userDao;

    @Override
    public List findAllUser(){
        return userDao.findAllUser();
    }

    @Override
    public UserInfo getUserInfo(int id) {
        return null;
    }

}

