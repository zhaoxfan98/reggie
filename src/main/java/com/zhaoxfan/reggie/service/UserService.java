package com.zhaoxfan.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhaoxfan.reggie.entity.User;

public interface UserService extends IService<User> {

    public void sendMsg(String to,String subject,String context);
}
