package com.baomidou.mybatisplus.samples.generator.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.UUID;

public abstract class DataEntity<T> extends BaseEntity<T> {
  private static final long serialVersionUID = 1L;
  protected String remarks;
  protected User createBy;
  protected Date createDate;
  protected User updateBy;
  protected Date updateDate;
  protected String delFlag;

  public DataEntity() {
    this.delFlag = "0";
  }

  public DataEntity(String id) {
    super(id);
  }

  public void preInsert() {
    if (!this.isNewRecord) {
      this.setId(UUID.randomUUID().toString().replaceAll("-", ""));
    }

    User user = new User();
    if (StringUtils.isNotBlank(user.getId())) {
      this.updateBy = user;
      this.createBy = user;
    }

    this.updateDate = new Date();
    this.createDate = this.updateDate;
  }

  public void preUpdate() {
    User user = new User();
    if (StringUtils.isNotBlank(user.getId())) {
      this.updateBy = user;
    }

    this.updateDate = new Date();
  }
  public String getRemarks() {
    return this.remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  @JsonIgnore
  public User getCreateBy() {
    return this.createBy;
  }

  public void setCreateBy(User createBy) {
    this.createBy = createBy;
  }

  @JsonFormat(
    pattern = "yyyy-MM-dd HH:mm:ss"
  )
  public Date getCreateDate() {
    return this.createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  @JsonIgnore
  public User getUpdateBy() {
    return this.updateBy;
  }

  public void setUpdateBy(User updateBy) {
    this.updateBy = updateBy;
  }

  @JsonFormat(
    pattern = "yyyy-MM-dd HH:mm:ss"
  )
  public Date getUpdateDate() {
    return this.updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  @JsonIgnore
  public String getDelFlag() {
    return this.delFlag;
  }

  public void setDelFlag(String delFlag) {
    this.delFlag = delFlag;
  }
}
