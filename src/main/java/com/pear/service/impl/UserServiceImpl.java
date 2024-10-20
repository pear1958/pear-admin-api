package com.pear.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.pear.entity.User;
import com.pear.dao.UserMapper;
import com.pear.service.UserService;

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
  /*
   * 根据用户名查询用户信息
   */
  @Override
  public User findUserByUserName(String username) {
    // 创建条件构造器
    QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
    queryWrapper.eq("username", username);
    return baseMapper.selectOne(queryWrapper);
  }
}
