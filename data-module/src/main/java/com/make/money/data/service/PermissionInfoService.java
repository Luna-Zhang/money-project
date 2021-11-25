package com.make.money.data.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.make.money.data.entity.BaseDictItem;
import com.make.money.data.entity.PermissionInfo;
import com.make.money.data.mapper.BaseDictItemMapper;
import com.make.money.data.mapper.PermissionInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author luna
 * @since 2021-11-24
 */
@Service
public class PermissionInfoService extends ServiceImpl<PermissionInfoMapper, PermissionInfo> {

    @Autowired
    private PermissionInfoMapper entityMapper;

    /**
     * 新增
     *
     * @param entity 实体
     * @return int
     */
    public void add(PermissionInfo entity) {
        int insert = entityMapper.insert(entity);
        if (insert <= 0) {
            // TODO 异常
        }
    }

    /**
     * 删除
     *
     * @param id id
     * @return int
     */
    public void deleteById(Integer id) {
        int only = entityMapper.deleteByPrimaryKey(Long.valueOf(id));
        if (only <= 0) {
            // TODO 异常
        }
    }

    /**
     * 根据id修改
     *
     * @param entity
     * @return int
     */
    public void edit(PermissionInfo entity) {
        int i = entityMapper.updateByPrimaryKey(entity);
        if (i <= 0) {
            // TODO 异常
        }
    }

    /**
     * 通过查询参数获取单个BaseDict对象
     *
     * @param id id
     * @return PermissionInfo
     */
    public PermissionInfo getOneBaseDictByParams(Integer id) {
        return entityMapper.selectByPrimaryKey(Long.valueOf(id));
    }

    /**
     * 分页查询
     *
     * @param entity
     * @return IPage<PermissionInfo>
     * TODO 分页查询的当前页和条数需要修改
     */
    public IPage<PermissionInfo> getBaseDictListPage(PermissionInfo entity) {
        IPage<PermissionInfo> page = new Page<>(1, 10);
        QueryWrapper<PermissionInfo> param = new QueryWrapper<>();
        return entityMapper.selectPage(page, param);
    }

}