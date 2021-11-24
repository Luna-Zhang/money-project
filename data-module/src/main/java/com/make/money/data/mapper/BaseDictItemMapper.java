package com.make.money.data.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.make.money.data.entity.BaseDictItem;

public interface BaseDictItemMapper extends BaseMapper<BaseDictItem> {
    int deleteByPrimaryKey(Long id);

    int insert(BaseDictItem record);

    int insertSelective(BaseDictItem record);

    BaseDictItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BaseDictItem record);

    int updateByPrimaryKey(BaseDictItem record);
}