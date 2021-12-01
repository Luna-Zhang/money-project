package com.make.money.data.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 多客绑定信息表
 * </p>
 *
 * @author luna
 * @since 2021-11-23
 */
@Data
@Accessors(chain = true)
@TableName("customer_band_info")
@ApiModel(value = "CustomerBandInfo对象", description = "多客绑定信息表")
public class CustomerBandInfo extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "逻辑删除：0-是 1-否")
    @TableField(value = "disable")
    @TableLogic
    private Boolean disable;

    @ApiModelProperty(value = "绑定id")
    @TableField(value = "bind_id")
    private String bindId;

    @ApiModelProperty(value = "多客id")
    @TableField(value = "customer_id")
    private String customerId;

    @ApiModelProperty(value = "绑定平台类型 1-小红书 2-抖音")
    @TableField(value = "bind_platform_type")
    private Integer bindPlatformType;

    @ApiModelProperty(value = "绑定账户")
    @TableField(value = "bind_account")
    private String bindAccount;

    @ApiModelProperty(value = "绑定昵称")
    @TableField(value = "bind_name")
    private String bindName;

    @ApiModelProperty(value = "绑定头像")
    @TableField(value = "bind_portrait")
    private String bindPortrait;

    @ApiModelProperty(value = "作品数量")
    @TableField(value = "bind_count")
    private String bindCount;

    @ApiModelProperty(value = "粉丝数量")
    @TableField(value = "bind_fans_count")
    private String bindFansCount;
}
