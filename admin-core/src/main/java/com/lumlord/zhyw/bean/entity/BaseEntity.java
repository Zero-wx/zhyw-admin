package com.lumlord.zhyw.bean.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created on 2023/5/12
 *
 * @author huangwx
 * Description:
 */
@Data
@JsonIgnoreProperties
public abstract class BaseEntity implements Serializable {
    // 自动填充公共字段bug
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT)
    private Integer createBy;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifyTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Integer modifyBy;
}
