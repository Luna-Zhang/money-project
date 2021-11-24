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
 * 角色表
 * </p>
 *
 * @author luna
 * @since 2021-11-23
 */
@Data
@Accessors(chain = true)
@TableName("role_info")
@ApiModel(value = "RoleInfo对象", description = "角色表")
public class RoleInfo extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "逻辑删除：0-是 1-否")
    @TableField(value = "disable")
    private Boolean disable;

    @ApiModelProperty(value = "角色id")
    @TableField(value = "role_id")
    private String roleId;

    @ApiModelProperty(value = "角色名称")
    @TableField(value = "role_name")
    private String roleName;

    @ApiModelProperty(value = "状态：0-禁用1-启用")
    @TableField(value = "status")
    private Boolean status;

}
