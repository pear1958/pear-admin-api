package com.pear.service.impl;

import com.pear.entity.Permission;
import com.pear.dao.PermissionMapper;
import com.pear.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {
  @Override
  public List<Permission> findPermissionListByUserId(Long userId) {
    return baseMapper.findPermissionListByUserId(userId);
  }
}
