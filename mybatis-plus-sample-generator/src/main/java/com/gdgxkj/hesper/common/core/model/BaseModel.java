package com.gdgxkj.hesper.common.core.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class BaseModel {

  protected String id;

  protected Date createDate;

  protected Date updateDate;

  protected String delFlag;

  protected String remarks;

  protected String _id;
}
