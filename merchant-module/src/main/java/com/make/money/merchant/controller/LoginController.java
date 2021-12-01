package com.make.money.merchant.controller;

import com.make.money.common.exception.MoneyProjectException;
import com.make.money.data.model.UserBean;
import com.make.money.data.response.HttpResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describe：登录模块
 * @Author：luna
 * @Date：2021/11/29:15:49
 */
@RestController
@Api(tags = "登录模块")
public class LoginController {

    @ApiOperation("登录")
    @PostMapping()
    public HttpResponse login (@RequestBody UserBean bean) {


        return null;
    }



}
