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
 * 用户角色关联表
 * </p>
 *
 * @author luna
 * @since 2021-11-23
 */
@Data
@Accessors(chain = true)
@TableName("user_role_info")
@ApiModel(value = "UserRoleInfo对象", description = "用户角色关联表")
public class UserRoleInfo extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "逻辑删除：0-是 1-否")
    @TableField(value = "disable")
    @TableLogic
    private Boolean disable;

    @ApiModelProperty(value = "用户id")
    @TableField(value = "user_id")
    private String userId;

    @ApiModelProperty(value = "角色id")
    @TableField(value = "role_id")
    private String roleId;
}
