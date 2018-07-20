package com.zpark.service;

import com.zpark.mapper.UserInfoMapper;
import com.zpark.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserInfoMapper um;



    @Override
    public void test() {
        System.out.println("service............");
        UserInfo userInfo = um.selectByPrimaryKey(1);
        System.out.println(userInfo);
        System.out.println("哈哈哈。。。。。。。");
    }

}
