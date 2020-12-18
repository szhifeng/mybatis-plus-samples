package com.baomidou.mybatisplus.samples.generator.evaluation.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.samples.generator.common.DataEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author szf
 * @since 2020-12-18
 */
@TableName("t_sys_user")
@ApiModel(value="User对象", description="用户表")
public class User extends DataEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "登录名")
    @TableField("login_name")
    private String loginName;

    @ApiModelProperty(value = "密码")
    @TableField("password")
    private String password;

    @ApiModelProperty(value = "工号")
    @TableField("no")
    private String no;

    @ApiModelProperty(value = "姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "邮箱")
    @TableField("email")
    private String email;

    @ApiModelProperty(value = "电话")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "手机")
    @TableField("mobile")
    private String mobile;

    @ApiModelProperty(value = "用户类型")
    @TableField("user_type")
    private String userType;

    @ApiModelProperty(value = "用户头像")
    @TableField("photo")
    private String photo;

    @ApiModelProperty(value = "最后登陆IP")
    @TableField("login_ip")
    private String loginIp;

    @ApiModelProperty(value = "最后登陆时间")
    @TableField("login_date")
    private Date loginDate;

    @ApiModelProperty(value = "是否可登录")
    @TableField("login_flag")
    private String loginFlag;

    @ApiModelProperty(value = "部门ID")
    @TableField("dept_id")
    private String deptId;

    @ApiModelProperty(value = "单位ID")
    @TableField("unit_id")
    private String unitId;

    @ApiModelProperty(value = "单位名称")
    @TableField("unit_name")
    private String unitName;

    @ApiModelProperty(value = "部门名称")
    @TableField("dept_name")
    private String deptName;

    @ApiModelProperty(value = "性别：1男、2 女")
    @TableField("sex")
    private String sex;

    @ApiModelProperty(value = "职务")
    @TableField("duty_name")
    private String dutyName;

    @ApiModelProperty(value = "职务代码")
    @TableField("duty_code")
    private String dutyCode;

    @ApiModelProperty(value = "身份证号码")
    @TableField("id_card")
    private String idCard;

    @ApiModelProperty(value = "级别名称")
    @TableField("level_name")
    private String levelName;

    @ApiModelProperty(value = "级别代码")
    @TableField("level_code")
    private String levelCode;

    @ApiModelProperty(value = "是否领导：0 是、1 否")
    @TableField("is_leader")
    private String isLeader;

    @ApiModelProperty(value = "是否考核：0 是、1 否")
    @TableField("is_examine")
    private String isExamine;

    @ApiModelProperty(value = "主管领导ID")
    @TableField("leader_id")
    private String leaderId;

    @ApiModelProperty(value = "领导信息：领导编号-领导名称")
    @TableField("leader_no_name")
    private String leaderNoName;

    @ApiModelProperty(value = "单元ID")
    @TableField("cell_id")
    private String cellId;

    @ApiModelProperty(value = "单元名称")
    @TableField("cell_name")
    private String cellName;

    @ApiModelProperty(value = "单元组ID")
    @TableField("group_id")
    private String groupId;

    @ApiModelProperty(value = "单元组名称")
    @TableField("group_name")
    private String groupName;

    @ApiModelProperty(value = "评价人员类别：领导班子正职、领导班子其他成员、干部群众代表、其他相关人员")
    @TableField("evaluator_type")
    private String evaluatorType;

    @TableField("is_charge")
    private String isCharge;

    @TableField("area_name")
    private String areaName;

    @TableField("area_code")
    private String areaCode;

    @ApiModelProperty(value = "是否公务员：0 是，1 否")
    @TableField("is_civil_servant")
    private String isCivilServant;


    public String getLoginName() {
        return loginName;
    }

    public User setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getNo() {
        return no;
    }

    public User setNo(String no) {
        this.no = no;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public User setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getUserType() {
        return userType;
    }

    public User setUserType(String userType) {
        this.userType = userType;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public User setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public User setLoginIp(String loginIp) {
        this.loginIp = loginIp;
        return this;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public User setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
        return this;
    }

    public String getLoginFlag() {
        return loginFlag;
    }

    public User setLoginFlag(String loginFlag) {
        this.loginFlag = loginFlag;
        return this;
    }

    public String getDeptId() {
        return deptId;
    }

    public User setDeptId(String deptId) {
        this.deptId = deptId;
        return this;
    }

    public String getUnitId() {
        return unitId;
    }

    public User setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }

    public String getUnitName() {
        return unitName;
    }

    public User setUnitName(String unitName) {
        this.unitName = unitName;
        return this;
    }

    public String getDeptName() {
        return deptName;
    }

    public User setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public User setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getDutyName() {
        return dutyName;
    }

    public User setDutyName(String dutyName) {
        this.dutyName = dutyName;
        return this;
    }

    public String getDutyCode() {
        return dutyCode;
    }

    public User setDutyCode(String dutyCode) {
        this.dutyCode = dutyCode;
        return this;
    }

    public String getIdCard() {
        return idCard;
    }

    public User setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }

    public String getLevelName() {
        return levelName;
    }

    public User setLevelName(String levelName) {
        this.levelName = levelName;
        return this;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public User setLevelCode(String levelCode) {
        this.levelCode = levelCode;
        return this;
    }

    public String getIsLeader() {
        return isLeader;
    }

    public User setIsLeader(String isLeader) {
        this.isLeader = isLeader;
        return this;
    }

    public String getIsExamine() {
        return isExamine;
    }

    public User setIsExamine(String isExamine) {
        this.isExamine = isExamine;
        return this;
    }

    public String getLeaderId() {
        return leaderId;
    }

    public User setLeaderId(String leaderId) {
        this.leaderId = leaderId;
        return this;
    }

    public String getLeaderNoName() {
        return leaderNoName;
    }

    public User setLeaderNoName(String leaderNoName) {
        this.leaderNoName = leaderNoName;
        return this;
    }

    public String getCellId() {
        return cellId;
    }

    public User setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }

    public String getCellName() {
        return cellName;
    }

    public User setCellName(String cellName) {
        this.cellName = cellName;
        return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public User setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public User setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getEvaluatorType() {
        return evaluatorType;
    }

    public User setEvaluatorType(String evaluatorType) {
        this.evaluatorType = evaluatorType;
        return this;
    }

    public String getIsCharge() {
        return isCharge;
    }

    public User setIsCharge(String isCharge) {
        this.isCharge = isCharge;
        return this;
    }

    public String getAreaName() {
        return areaName;
    }

    public User setAreaName(String areaName) {
        this.areaName = areaName;
        return this;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public User setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    public String getIsCivilServant() {
        return isCivilServant;
    }

    public User setIsCivilServant(String isCivilServant) {
        this.isCivilServant = isCivilServant;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
        "loginName=" + loginName +
        ", password=" + password +
        ", no=" + no +
        ", name=" + name +
        ", email=" + email +
        ", phone=" + phone +
        ", mobile=" + mobile +
        ", userType=" + userType +
        ", photo=" + photo +
        ", loginIp=" + loginIp +
        ", loginDate=" + loginDate +
        ", loginFlag=" + loginFlag +
        ", deptId=" + deptId +
        ", unitId=" + unitId +
        ", unitName=" + unitName +
        ", deptName=" + deptName +
        ", sex=" + sex +
        ", dutyName=" + dutyName +
        ", dutyCode=" + dutyCode +
        ", idCard=" + idCard +
        ", levelName=" + levelName +
        ", levelCode=" + levelCode +
        ", isLeader=" + isLeader +
        ", isExamine=" + isExamine +
        ", leaderId=" + leaderId +
        ", leaderNoName=" + leaderNoName +
        ", cellId=" + cellId +
        ", cellName=" + cellName +
        ", groupId=" + groupId +
        ", groupName=" + groupName +
        ", evaluatorType=" + evaluatorType +
        ", isCharge=" + isCharge +
        ", areaName=" + areaName +
        ", areaCode=" + areaCode +
        ", isCivilServant=" + isCivilServant +
        "}";
    }
}
