package com.example.minimumcqrssample.infrastructure.mysqlrepository.article;

import com.example.minimumcqrssample.domain.model.article.Article;
import com.example.minimumcqrssample.domain.model.article.ArticleId;
import com.example.minimumcqrssample.domain.model.article.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class ArticleMySQLRepository implements ArticleRepository {

  private ArticleMapper articleMapper;

  @Override
  public Optional<Article> findById(ArticleId articleId) {
    return articleMapper.findById(articleId);
  }
}
