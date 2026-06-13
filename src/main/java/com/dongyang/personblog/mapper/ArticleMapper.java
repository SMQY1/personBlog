package com.dongyang.personblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dongyang.personblog.entity.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}