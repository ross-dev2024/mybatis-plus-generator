package com.service;

import com.domain.PkgEntity;

/**
 * 部门表(sys_pkg)表服务接口
 *
 * @author wangjw
 * @since 2024-04-08 12:16:18
 */
public interface SysPkgService {

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  PkgEntity queryById(Long id);

  /**
   * 新增数据
   *
   * @param pkgEntity 实例对象
   * @return 实例对象
   */
  PkgEntity insert(PkgEntity pkgEntity);

  /**
   * 修改数据
   *
   * @param pkgEntity 实例对象
   * @return 实例对象
   */
  PkgEntity update(PkgEntity pkgEntity);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  boolean deleteById(Long id);
}
