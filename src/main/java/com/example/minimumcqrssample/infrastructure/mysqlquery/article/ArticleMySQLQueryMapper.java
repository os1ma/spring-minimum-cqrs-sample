package com.example.minimumcqrssample.infrastructure.mysqlquery.article;

import com.example.minimumcqrssample.interfaces.api.article.ArticleListQueryResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMySQLQueryMapper {
  List<ArticleListQueryResponse.Article> list();
}
