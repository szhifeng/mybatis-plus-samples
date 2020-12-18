package com.baomidou.mybatisplus.samples.generator.common;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.io.Serializable;
import java.util.Map;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


public abstract class BaseEntity<T> implements Serializable {
  private static final long serialVersionUID = 1L;
  protected String id;
  protected User currentUser;
  protected Map<String, String> sqlMap;
  protected boolean isNewRecord;
  public static final String DEL_FLAG_NORMAL = "0";
  public static final String DEL_FLAG_DELETE = "1";
  public static final String DEL_FLAG_AUDIT = "2";

  public BaseEntity() {
    this.isNewRecord = false;
  }

  public BaseEntity(String id) {
    this();
    this.id = id;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }



  public void setCurrentUser(User currentUser) {
    this.currentUser = currentUser;
  }


  public boolean equals(Object obj) {
    if (null == obj) {
      return false;
    } else if (this == obj) {
      return true;
    } else if (!this.getClass().equals(obj.getClass())) {
      return false;
    } else {
      BaseEntity<?> that = (BaseEntity)obj;
      return null == this.getId() ? false : this.getId().equals(that.getId());
    }
  }

  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }
}
