package com.make.money.data.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.make.money.data.entity.RoleInfo;

public interface RoleInfoMapper extends BaseMapper<RoleInfo> {
    int deleteByPrimaryKey(Long id);

    int insert(RoleInfo record);

    int insertSelective(RoleInfo record);

    RoleInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleInfo record);

    int updateByPrimaryKey(RoleInfo record);
}