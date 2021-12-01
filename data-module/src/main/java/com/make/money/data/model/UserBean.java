package com.make.money.data.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Describe：
 * @Author：luna
 * @Date：2021/11/29:15:53
 */
@Data
public class UserBean extends BasicsRequest{
    @ApiModelProperty("手机号")
    private String phone ;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("用户名")
    private String userName;



}
