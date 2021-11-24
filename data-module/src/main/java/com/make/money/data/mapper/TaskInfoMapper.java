package com.make.money.data.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.make.money.data.entity.TaskInfo;

public interface TaskInfoMapper extends BaseMapper<TaskInfo> {
    int deleteByPrimaryKey(Long id);

    int insert(TaskInfo record);

    int insertSelective(TaskInfo record);

    TaskInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TaskInfo record);

    int updateByPrimaryKey(TaskInfo record);
}