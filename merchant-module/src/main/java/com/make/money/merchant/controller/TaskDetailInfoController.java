package com.make.money.merchant.controller;

import com.make.money.data.entity.TaskDetailInfo;
import com.make.money.data.response.HttpResponse;
import com.make.money.data.service.TaskDetailInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 任务明细表 前端控制器
 * </p>
 *
 * @author luna
 * @since 2021-11-24
 */
@RestController
@RequestMapping("/taskDetailInfo")
@Api(tags = "任务明细表")
public class TaskDetailInfoController {

    @Resource
    private TaskDetailInfoService service;

    /**
     * 添加
     *
     * @return HttpResponse
     * @author luna
     * @date 2021-11-24
     */
    @ApiOperation("添加")
    @PostMapping(value = "/add")
    public HttpResponse add(@RequestBody TaskDetailInfo entity) {
        service.add(entity);
        return HttpResponse.ok();
    }

    /**
     * 通过主键删除
     *
     * @return HttpResponse
     * @author luna
     * @date 2021-11-24
     */
    @ApiOperation("通过主键删除")
    @DeleteMapping(value = "/deleteById/{id}")
    public HttpResponse batchDelete(@PathVariable("id") Integer id) {
        service.deleteById(id);
        return HttpResponse.ok();
    }

    /**
     * 编辑
     *
     * @return HttpResponse
     * @author luna
     * @date 2021-11-24
     */
    @ApiOperation("编辑")
    @PutMapping(value = "/updateById")
    public HttpResponse edit(@RequestBody TaskDetailInfo entity) {
        service.edit(entity);
        return HttpResponse.ok();
    }

    /**
     * 获取信息
     *
     * @return HttpResponse
     * @author luna
     * @date 2021-11-24
     */
    @ApiOperation("根据id获取信息")
    @GetMapping(value = "/getOneInfoById/{id}")
    public HttpResponse getInfoById(@PathVariable("id") Integer id) {
        return HttpResponse.ok(service.getOneBaseDictByParams(id));
    }

    /**
     * 获取信息
     *
     * @return HttpResponse
     * @author luna
     * @date 2021-11-24
     */
    @ApiOperation("分页查询")
    @GetMapping(value = "/getPageList")
    public HttpResponse get(@RequestBody TaskDetailInfo entity) {
        return HttpResponse.ok(service.getBaseDictListPage(entity));
    }
}
