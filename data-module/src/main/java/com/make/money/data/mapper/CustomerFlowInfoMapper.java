package com.make.money.data.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.make.money.data.entity.CustomerFlowInfo;

public interface CustomerFlowInfoMapper extends BaseMapper<CustomerFlowInfo> {
    int deleteByPrimaryKey(Long id);

    int insert(CustomerFlowInfo record);

    int insertSelective(CustomerFlowInfo record);

    CustomerFlowInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomerFlowInfo record);

    int updateByPrimaryKey(CustomerFlowInfo record);
}