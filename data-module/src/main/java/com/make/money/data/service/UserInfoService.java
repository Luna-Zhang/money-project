package com.make.money.data.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.make.money.data.entity.BaseDictItem;
import com.make.money.data.entity.UserInfo;
import com.make.money.data.mapper.BaseDictItemMapper;
import com.make.money.data.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author luna
 * @since 2021-11-24
 */
@Resource
public class UserInfoService extends ServiceImpl<UserInfoMapper, UserInfo> {

@Autowired
private UserInfoMapper entityMapper;

    /**
    * 新增
    *
    * @param entity 实体
    * @return int
    */
    public void add(UserInfo entity){
        int insert = entityMapper.insert(entity);
        if (insert <= 0) {
        // TODO 异常
        }
    }

    /**
       * 删除
       *  @param id id
       *  @return int
       */
    public void deleteById(Integer id) {
        int only = entityMapper.deleteByPrimaryKey(Long.valueOf(id));
        if (only <= 0) {
        // TODO 异常
        }
    }

    /**
    * 根据id修改
    *  @param entity
    *  @return int
    */
    public void edit(UserInfo entity) {
        int i = entityMapper.updateByPrimaryKey(entity);
        if (i<= 0){
        // TODO 异常
        }
    }

    /**
    * 通过查询参数获取单个BaseDict对象
    *
    * @param id id
    * @return UserInfo
    */
    public UserInfo getOneBaseDictByParams(Integer id) {
        return entityMapper.selectByPrimaryKey(Long.valueOf(id));
    }

    /**
    * 分页查询
    * @param entity
    * @return IPage<UserInfo>
    * TODO 分页查询的当前页和条数需要修改
    */
    public IPage<UserInfo> getBaseDictListPage (UserInfo entity) {
        IPage<UserInfo> page = new Page<>(1,10);
        QueryWrapper<UserInfo> param = new QueryWrapper<>();
        return entityMapper.selectPage(page, param);
    }

}