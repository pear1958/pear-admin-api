package com.pear.controller;

import com.pear.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import com.pear.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
  @Resource
  private UserService userService;

  /**
   * 查询所有用户列表
   */
  @GetMapping("/listAll")
  public Result listAll(){
    return Result.ok(userService.list());
  }
}

