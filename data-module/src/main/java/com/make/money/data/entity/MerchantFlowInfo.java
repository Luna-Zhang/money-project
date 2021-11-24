package com.make.money.data.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.*;

/**
 * <p>
 * 商户流水表
 * </p>
 *
 * @author luna
 * @since 2021-11-23
 */
@Data
@Accessors(chain = true)
@TableName("merchant_flow_info")
@ApiModel(value = "MerchantFlowInfo对象", description = "商户流水表")
public class MerchantFlowInfo extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "逻辑删除：0-是 1-否")
    @TableField(value = "disable")
    private Boolean disable;

    @ApiModelProperty(value = "商户流水id")
    @TableField(value = "merchant_flow_id")
    private String merchantFlowId;

    @ApiModelProperty(value = "任务id")
    @TableField(value = "task_id")
    private String taskId;

    @ApiModelProperty(value = "商户id")
    @TableField(value = "merchant_id")
    private String merchantId;

    @ApiModelProperty(value = "商户流水类型：1-充值 2-下单 3-退款")
    @TableField(value = "merchant_flow_type")
    private Integer merchantFlowType;

    @ApiModelProperty(value = "商户流水名称")
    @TableField(value = "merchant_flow_name")
    private String merchantFlowName;

    @ApiModelProperty(value = "金额")
    @TableField(value = "amount")
    private BigDecimal amount;

    @ApiModelProperty(value = "排序")
    @TableField(value = "sort")
    private Integer sort;
}
