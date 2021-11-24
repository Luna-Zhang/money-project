package com.make.money.data.entity;

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
 * 父级基础字典表
 * </p>
 *
 * @author luna
 * @since 2021-11-23
 */
@Data
@Accessors(chain = true)
@TableName("base_dict")
@ApiModel(value = "BaseDict对象", description = "父级基础字典表")
public class BaseDict extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "逻辑删除：0-是 1-否")
    @TableField(value = "disable")
    private Boolean disable;

    @ApiModelProperty(value = "字典编码")
    @TableField(value = "dict_code")
    private String dictCode;

    @ApiModelProperty(value = "字典名称")
    @TableField(value = "dict_name")
    private String dictName;

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
