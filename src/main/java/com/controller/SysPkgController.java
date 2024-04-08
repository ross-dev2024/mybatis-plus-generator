package com.controller;

import com.domain.PkgEntity;
import com.service.impl.SysPkgService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 部门表(SysPkg)表控制层
 *
 * @author wangjw
 * @since 2024-04-08 12:17:59
 */
@RestController
@RequestMapping("pkgEntity")
public class SysPkgController {
  /** 服务对象 */
  @Resource private SysPkgService sysPkgService;

  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @GetMapping("{id}")
  public ResponseEntity<PkgEntity> queryById(@PathVariable("id") Long id) {
    return ResponseEntity.ok(this.sysPkgService.queryById(id));
  }

  /**
   * 新增数据
   *
   * @param pkgEntity 实体
   * @return 新增结果
   */
  @PostMapping
  public ResponseEntity<PkgEntity> add(PkgEntity pkgEntity) {
    return ResponseEntity.ok(this.sysPkgService.insert(pkgEntity));
  }

  /**
   * 编辑数据
   *
   * @param pkgEntity 实体
   * @return 编辑结果
   */
  @PutMapping
  public ResponseEntity<PkgEntity> edit(PkgEntity pkgEntity) {
    return ResponseEntity.ok(this.sysPkgService.update(pkgEntity));
  }

  /**
   * 删除数据
   *
   * @param id 主键
   * @return 删除是否成功
   */
  @DeleteMapping
  public ResponseEntity<Boolean> deleteById(Long id) {
    return ResponseEntity.ok(this.sysPkgService.deleteById(id));
  }
}
