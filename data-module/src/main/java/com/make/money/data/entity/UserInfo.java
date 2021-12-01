package com.make.money.data.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author luna
 * @since 2021-11-23
 */
@Data
@Accessors(chain = true)
@TableName("user_info")
@ApiModel(value = "UserInfo对象", description = "用户信息表")
public class UserInfo extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "逻辑删除：0-是 1-否")
    @TableField(value = "disable")
    @TableLogic
    private Boolean disable;

    @ApiModelProperty(value = "用户id")
    @TableField(value = "user_id")
    private String userId;

    @ApiModelProperty(value = "用户名")
    @TableField(value = "user_name")
    private String userName;

    @ApiModelProperty(value = "密码")
    @TableField(value = "pass_word")
    private String passWord;

    @ApiModelProperty(value = "手机号")
    @TableField(value = "mobile")
    private String mobile;

    @ApiModelProperty(value = "qq")
    @TableField(value = "qq")
    private String qq;

    @ApiModelProperty(value = "邮箱")
    @TableField(value = "e_mail")
    private String eMail;

    @ApiModelProperty(value = "余额")
    @TableField(value = "amount")
    private BigDecimal amount;

    @ApiModelProperty(value = "用户类型：1-商户2-兼职用户3-系统用户")
    @TableField(value = "user_type")
    private Integer userType;

    @ApiModelProperty(value = "状态：0-禁用1-启用")
    @TableField(value = "status")
    private Boolean status;

    @ApiModelProperty(value = "排序")
    @TableField(value = "sort")
    private Integer sort;

}
