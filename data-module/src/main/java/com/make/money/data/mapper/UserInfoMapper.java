package com.make.money.data.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.make.money.data.entity.UserInfo;

public interface UserInfoMapper extends BaseMapper<UserInfo> {
    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}