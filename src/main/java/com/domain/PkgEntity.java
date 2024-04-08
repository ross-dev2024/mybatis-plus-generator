package com.domain;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

/**
 * 部门表(SysPkg)实体类
 *
 * @author wangjw
 * @since 2024-04-08 12:17:59
 */
@Data
public class PkgEntity implements Serializable {
  private static final long serialVersionUID = -92599611467648290L;

  /** 主键 */
  private Long id;

  /** 部门名称 */
  private String name;

  /** 父节点id */
  private Long parentId;

  /** 父节点id路径 */
  private String treePath;

  /** 显示顺序 */
  private Integer sort;

  /** 状态(1:正常;0:禁用) */
  private Integer status;

  private String pkgType;

  private String location;

  private Date sendDate;

  private Date toDate;

  /** 逻辑删除标识(1:已删除;0:未删除) */
  private Integer deleted;

  /** 创建时间 */
  private Date createTime;

  /** 更新时间 */
  private Date updateTime;
}
