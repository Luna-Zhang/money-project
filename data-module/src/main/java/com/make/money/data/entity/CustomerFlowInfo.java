package com.make.money.data.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * <p>
 * 多客流水表
 * </p>
 *
 * @author luna
 * @since 2021-11-23
 */
@Data
@Accessors(chain = true)
@TableName("customer_flow_info")
@ApiModel(value = "CustomerFlowInfo对象", description = "多客流水表")
public class CustomerFlowInfo extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "逻辑删除：0-是 1-否")
    @TableField(value = "disable")
    @TableLogic
    private Boolean disable;

    @ApiModelProperty(value = "多客流水id")
    @TableField(value = "customer_flow_id")
    private String customerFlowId;

    @ApiModelProperty(value = "任务id")
    @TableField(value = "task_id")
    private String taskId;

    @ApiModelProperty(value = "金额")
    @TableField(value = "amount")
    private BigDecimal amount;

    @ApiModelProperty(value = "多客流水类型：1-提现 2-任务完成")
    @TableField(value = "customer_flow_type")
    private Integer customerFlowType;

    @ApiModelProperty(value = "多客流水名称")
    @TableField(value = "customer_flow_name")
    private String customerFlowName;

    @ApiModelProperty(value = "排序")
    @TableField(value = "sort")
    private Integer sort;
}
