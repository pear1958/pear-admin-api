package com.pear.service;

import com.pear.entity.Permission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface PermissionService extends IService<Permission> {
  /**
   * 根据用户ID查询权限列表
   */
  List<Permission> findPermissionListByUserId(Long userId);
}
