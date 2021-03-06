package com.make.money.data.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.make.money.data.entity.CustomerBandInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerBandInfoMapper extends BaseMapper<CustomerBandInfo> {
    int deleteByPrimaryKey(Long id);

    int insert(CustomerBandInfo record);

    int insertSelective(CustomerBandInfo record);

    CustomerBandInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomerBandInfo record);

    int updateByPrimaryKey(CustomerBandInfo record);
}