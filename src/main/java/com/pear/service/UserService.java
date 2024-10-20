package com.pear.service;

import com.pear.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

public interface UserService extends IService<User> {
  /*
  * 根据用户名查询用户信息
  */
  User findUserByUserName(String name);
}
