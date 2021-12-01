package com.make.money.data.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author luna
 * @since 2021-11-23
 */
@Data
@Accessors(chain = true)
@TableName("permission_info")
@ApiModel(value = "PermissionInfo对象", description = "权限表")
public class PermissionInfo extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "逻辑删除：0-是 1-否")
    @TableField(value = "disable")
    @TableLogic
    private Boolean disable;

    @ApiModelProperty(value = "权限id")
    @TableField(value = "permission_id")
    private String permissionId;

    @ApiModelProperty(value = "权限名称")
    @TableField(value = "permission_name")
    private String permissionName;

    @ApiModelProperty(value = "状态：0-禁用1-启用")
    @TableField(value = "status")
    private Integer status;

}
