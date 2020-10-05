package com.c505whu.watchservice.entity;

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
 * 用户信息
 * </p>
 *
 * @author thc
 * @since 2020-10-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("watch_user")
@ApiModel(value="WatchUser对象", description="用户信息")
public class WatchUser extends Model<WatchUser> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "MAC地址")
    private Integer mac;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "删除状态（1:删除，0:没删除）")
    private Boolean gmtModified;

    @ApiModelProperty(value = "更新时间")
    private Date gmtUpdate;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
