package com.springboot.service.system.impl;

import com.springboot.common.busi.ResponseData;
import com.springboot.entity.User;
import com.springboot.mapper.UserMapper;
import com.springboot.service.system.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public ResponseData selectByUserAccount(String userAccount) {
        User user = userMapper.getLoginUserByUserId(userAccount);
        return ResponseData.success(user,"查询用户成功");
    }
}
