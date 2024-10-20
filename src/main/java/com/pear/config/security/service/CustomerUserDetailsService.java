package com.pear.config.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.pear.entity.User;
import com.pear.service.UserService;

/*
 * 用户认证处理器类
 */
@Component
public class CustomerUserDetailsService implements UserDetailsService {
  @Resource
  private UserService userService;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    // 调用根据用户名查询用户信息的方法
    User user = userService.findUserByUserName(username);
    // 如果对象为空，则认证失败
    if (user == null) {
      throw new UsernameNotFoundException("用户名错误!");
    }
    return user;
  }
}
