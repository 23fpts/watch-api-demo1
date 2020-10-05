package com.c505whu.watchservice.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 实时数据
 * </p>
 *
 * @author thc
 * @since 2020-10-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("watch_data")
@ApiModel(value="WatchData对象", description="实时数据")
public class WatchData extends Model<WatchData> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "userId")
    private Integer userId;

    @ApiModelProperty(value = "MAC地址")
    private Integer mac;

    @ApiModelProperty(value = "运动时长")
    private Integer sportsTime;

    @ApiModelProperty(value = "实时心率")
    private Integer realTimeHeartRate;

    @ApiModelProperty(value = "平均心率")
    private Integer averageHeartRate;

    @ApiModelProperty(value = "距离")
    private Integer distance;

    @ApiModelProperty(value = "卡路里")
    private Integer calorie;

    @ApiModelProperty(value = "总步数")
    private Integer totalStepCount;

    @ApiModelProperty(value = "实时步频")
    private Integer realTimeCadence;

    @ApiModelProperty(value = "平均步频")
    private Integer averageCadence;

    @ApiModelProperty(value = "运动类型")
    private Integer sportsType;

    @ApiModelProperty(value = "实时速度")
    private BigDecimal realTimeSpeed;

    @ApiModelProperty(value = "平均速度")
    private BigDecimal averageSpeed;

    @ApiModelProperty(value = "运动状态")
    private Integer sportsStatus;

    @ApiModelProperty(value = "经度")
    private BigDecimal longitude;

    @ApiModelProperty(value = "纬度")
    private BigDecimal latitude;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "删除状态（1:删除，0:没删除）")
    @TableField("is_deleted")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
