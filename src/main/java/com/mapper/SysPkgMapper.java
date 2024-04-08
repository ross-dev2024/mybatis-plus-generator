package com.mapper;

import com.domain.PkgEntity;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 部门表(sys_pkg)表数据库访问层
 *
 * @author wangjw
 * @since 2024-04-08 12:17:58
 */
public interface SysPkgMapper {

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  PkgEntity selectByPrimaryKey(Long id);

  /**
   * 统计总行数
   *
   * @param pkgEntity 查询条件
   * @return 总行数
   */
  long count(PkgEntity pkgEntity);

  /**
   * 新增数据
   *
   * @param pkgEntity 实例对象
   * @return 影响行数
   */
  int insert(PkgEntity pkgEntity);

  /**
   * 新增数据
   *
   * @param pkgEntity 实例对象
   * @return 影响行数
   */
  int insertSelective(PkgEntity pkgEntity);

  /**
   * 批量新增数据（MyBatis原生foreach方法）
   *
   * @param entities List<PkgEntity> 实例对象列表
   * @return 影响行数
   */
  int insertBatch(@Param("entities") List<PkgEntity> entities);

  /**
   * 批量新增或按主键更新数据（MyBatis原生foreach方法）
   *
   * @param entities List<PkgEntity> 实例对象列表
   * @return 影响行数
   * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
   */
  int insertOrUpdateBatch(@Param("entities") List<PkgEntity> entities);

  /**
   * 修改数据
   *
   * @param pkgEntity 实例对象
   * @return 影响行数
   */
  int update(PkgEntity pkgEntity);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 影响行数
   */
  int deleteById(Long id);
}
