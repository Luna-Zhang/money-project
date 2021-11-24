package com.make.money.data.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.make.money.data.entity.MerchantFlowInfo;

public interface MerchantFlowInfoMapper extends BaseMapper<MerchantFlowInfo> {
    int deleteByPrimaryKey(Long id);

    int insert(MerchantFlowInfo record);

    int insertSelective(MerchantFlowInfo record);

    MerchantFlowInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MerchantFlowInfo record);

    int updateByPrimaryKey(MerchantFlowInfo record);
}