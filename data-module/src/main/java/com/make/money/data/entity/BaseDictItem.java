package com.make.money.data.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.*;

/**
 * <p>
 * 基础字典表
 * </p>
 *
 * @author luna
 * @since 2021-11-23
 */
@Data
@Accessors(chain = true)
@TableName("base_dict_item")
@ApiModel(value = "BaseDictItem对象", description = "基础字典表")
public class BaseDictItem extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "逻辑删除：0-是 1-否")
    @TableField(value = "disable")
    @TableLogic
    private Boolean disable;

    @ApiModelProperty(value = "字典编码 1-评论 2-点赞 3-收藏")
    @TableField(value = "dict_code")
    private String dictCode;

    @ApiModelProperty(value = "字典名称")
    @TableField(value = "dict_name")
    private String dictName;

    @ApiModelProperty(value = "单价")
    @TableField(value = "unit_price")
    private BigDecimal unitPrice;

    @ApiModelProperty(value = "父字典编码")
    @TableField(value = "parent_code")
    private String parentCode;

    @ApiModelProperty(value = "状态：0-禁用1-启用")
    @TableField(value = "status")
    private Boolean status;

    @ApiModelProperty(value = "备注")
    @TableField(value = "remark")
    private String remark;

    @ApiModelProperty(value = "排序")
    @TableField(value = "sort")
    private Integer sort;
}
