package com.pear.dao;

import com.pear.entity.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface PermissionMapper extends BaseMapper<Permission> {
  /**
   * 根据用户ID查询权限列表
   */
  List<Permission> findPermissionListByUserId(Long userId);
}
