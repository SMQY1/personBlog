package com.dongyang.personblog.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import lombok.Data;
import java.util.Date;

@Data
public class Article {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String title;

    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private String content;
    private String category;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}