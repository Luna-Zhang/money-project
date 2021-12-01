package com.make.money.auth.oauth;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.make.money.common.constants.RedisConstant;
import com.make.money.common.constants.SysParamConstant;
import com.make.money.common.exception.MoneyProjectException;
import com.make.money.data.entity.UserInfo;
import com.make.money.data.redis.RedisService;
import com.make.money.data.service.UserInfoService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Describe：自定义shiro认证
 * @Author：luna
 * @Date：2021/11/29:12:58
 */
public class MyShiroRealm extends AuthorizingRealm {

    @Resource
    private UserInfoService userInfoService;

    @Resource
    private RedisService redisService;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String token = authenticationToken.getPrincipal().toString();
        if (null == token) {
           throw new MoneyProjectException("error_1000");
        }
        Object userId = redisService.get(RedisConstant.TOKEN_PREFIX + token);
        if (null == userId) {
            // todo 日志记录
            throw new MoneyProjectException("error_1000");
        }
        List<UserInfo> userInfoList = userInfoService.findByParam(SysParamConstant.USER_ID, userId.toString());
        if (CollectionUtils.isEmpty(userInfoList)) {
            throw new MoneyProjectException("error_1000");
        }
        // 这里验证authenticationToken和simpleAuthenticationInfo的信息
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(userInfoList.get(0), token, getName());
        return simpleAuthenticationInfo;
    }
}
