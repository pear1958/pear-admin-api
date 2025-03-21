package com.pear.config.mybatis;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

// 自动填充配置类

@Component
public class CommonMetaObjectHandler implements MetaObjectHandler {
  /**
   * 新增
   */
  @Override
  public void insertFill(MetaObject metaObject) {
    this.strictInsertFill(metaObject, "createTime", Date.class, new Date());
    this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date());
  }

  /**
   * 修改
   */
  @Override
  public void updateFill(MetaObject metaObject) {
    this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date());
  }
}
