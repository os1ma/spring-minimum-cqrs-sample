package com.example.minimumcqrssample.infrastructure.mysqlrepository.article;

import com.example.minimumcqrssample.domain.model.article.Article;
import com.example.minimumcqrssample.domain.model.article.ArticleId;
import com.example.minimumcqrssample.domain.model.like.Like;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface ArticleMapper {
  Optional<Article> findById(ArticleId articleId);
}
