package com.make.money.data.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.make.money.data.entity.TaskDetailInfo;

public interface TaskDetailInfoMapper extends BaseMapper<TaskDetailInfo> {
    int deleteByPrimaryKey(Long id);

    int insert(TaskDetailInfo record);

    int insertSelective(TaskDetailInfo record);

    TaskDetailInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TaskDetailInfo record);

    int updateByPrimaryKey(TaskDetailInfo record);
}