package com.baomidou.mybatisplus.samples.generator.evaluation.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.samples.generator.common.DataEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 班子或干部测评结果
 * </p>
 *
 * @author szf
 * @since 2020-12-18
 */
@TableName("t_eval_result")
@ApiModel(value="Result对象", description="班子或干部测评结果")
public class Result extends DataEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "年度")
    @TableField("year")
    private Integer year;

    @ApiModelProperty(value = "类型：0 班子、1 干部")
    @TableField("type")
    private String type;

    @ApiModelProperty(value = "单位ID或用户ID")
    @TableField("bs_id")
    private String bsId;

    @ApiModelProperty(value = "民主测评ID")
    @TableField("eval_manage_id")
    private String evalManageId;

    @ApiModelProperty(value = "测评方案ID")
    @TableField("eval_case_id")
    private String evalCaseId;

    @ApiModelProperty(value = "明细ID")
    @TableField("case_detail_id")
    private String caseDetailId;

    @ApiModelProperty(value = "等级（根据明细ID获取）")
    @TableField("case_detail_name")
    private String caseDetailName;

    @ApiModelProperty(value = "分数（根据明细分数获取）")
    @TableField("score")
    private BigDecimal score;

    @TableField("detail_result_id")
    private String detailResultId;


    public Integer getYear() {
        return year;
    }

    public Result setYear(Integer year) {
        this.year = year;
        return this;
    }

    public String getType() {
        return type;
    }

    public Result setType(String type) {
        this.type = type;
        return this;
    }

    public String getBsId() {
        return bsId;
    }

    public Result setBsId(String bsId) {
        this.bsId = bsId;
        return this;
    }

    public String getEvalManageId() {
        return evalManageId;
    }

    public Result setEvalManageId(String evalManageId) {
        this.evalManageId = evalManageId;
        return this;
    }

    public String getEvalCaseId() {
        return evalCaseId;
    }

    public Result setEvalCaseId(String evalCaseId) {
        this.evalCaseId = evalCaseId;
        return this;
    }

    public String getCaseDetailId() {
        return caseDetailId;
    }

    public Result setCaseDetailId(String caseDetailId) {
        this.caseDetailId = caseDetailId;
        return this;
    }

    public String getCaseDetailName() {
        return caseDetailName;
    }

    public Result setCaseDetailName(String caseDetailName) {
        this.caseDetailName = caseDetailName;
        return this;
    }

    public BigDecimal getScore() {
        return score;
    }

    public Result setScore(BigDecimal score) {
        this.score = score;
        return this;
    }

    public String getDetailResultId() {
        return detailResultId;
    }

    public Result setDetailResultId(String detailResultId) {
        this.detailResultId = detailResultId;
        return this;
    }

    @Override
    public String toString() {
        return "Result{" +
        "year=" + year +
        ", type=" + type +
        ", bsId=" + bsId +
        ", evalManageId=" + evalManageId +
        ", evalCaseId=" + evalCaseId +
        ", caseDetailId=" + caseDetailId +
        ", caseDetailName=" + caseDetailName +
        ", score=" + score +
        ", detailResultId=" + detailResultId +
        "}";
    }
}
