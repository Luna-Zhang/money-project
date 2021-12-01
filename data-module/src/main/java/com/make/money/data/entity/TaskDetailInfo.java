package com.make.money.data.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 任务明细表
 * </p>
 *
 * @author luna
 * @since 2021-11-23
 */
@Data
@Accessors(chain = true)
@TableName("task_detail_info")
@ApiModel(value = "TaskDetailInfo对象", description = "任务明细表")
public class TaskDetailInfo extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "逻辑删除：0-是 1-否")
    @TableField(value = "disable")
    @TableLogic
    private Boolean disable;

    @ApiModelProperty(value = "任务明细id")
    @TableField(value = "task_detail_id")
    private String taskDetailId;

    @ApiModelProperty(value = "多客id")
    @TableField(value = "customer_id")
    private String customerId;

    @ApiModelProperty(value = "任务id")
    @TableField(value = "task_id")
    private String taskId;

    @ApiModelProperty(value = "图片地址")
    @TableField(value = "image_url")
    private String imageUrl;

    @ApiModelProperty(value = "执行状态： I-进行中 G-放弃 W-待审核  S-审核通过 F-审核不通过")
    @TableField(value = "excut_status")
    private String excutStatus;

    @ApiModelProperty(value = "提交时间")
    @TableField(value = "submit_time")
    private Date submitTime;

    @ApiModelProperty(value = "审核人")
    @TableField(value = "aduit_by")
    private String aduitBy;

    @ApiModelProperty(value = "审核时间")
    @TableField(value = "audit_time")
    private Date auditTime;

    @ApiModelProperty(value = "处理结果")
    @TableField(value = "audit_result")
    private String auditResult;

    @ApiModelProperty(value = "排序")
    @TableField(value = "sort")
    private Integer sort;
}
