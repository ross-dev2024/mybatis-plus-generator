package com.service.impl;

import com.domain.PkgEntity;
import com.mapper.SysPkgMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 部门表(SysPkg)表服务实现类
 *
 * @author wangjw
 * @since 2024-04-08 12:17:58
 */
@Service("sysPkgService")
public class SysPkgService {
  @Resource private SysPkgMapper sysPkgMapper;

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  public PkgEntity queryById(Long id) {
    return this.sysPkgMapper.selectByPrimaryKey(id);
  }

  /**
   * 新增数据
   *
   * @param pkgEntity 实例对象
   * @return 实例对象
   */
  public PkgEntity insert(PkgEntity pkgEntity) {
    this.sysPkgMapper.insert(pkgEntity);
    return pkgEntity;
  }

  /**
   * 修改数据
   *
   * @param pkgEntity 实例对象
   * @return 实例对象
   */
  public PkgEntity update(PkgEntity pkgEntity) {
    this.sysPkgMapper.update(pkgEntity);
    return this.queryById(pkgEntity.getId());
  }

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  public boolean deleteById(Long id) {
    return this.sysPkgMapper.deleteById(id) > 0;
  }
}
