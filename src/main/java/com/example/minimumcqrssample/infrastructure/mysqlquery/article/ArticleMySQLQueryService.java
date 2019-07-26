package com.example.minimumcqrssample.infrastructure.mysqlquery.article;

import com.example.minimumcqrssample.interfaces.api.article.ArticleListQueryResponse;
import com.example.minimumcqrssample.interfaces.api.article.ArticleQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ArticleMySQLQueryService implements ArticleQueryService {

  private ArticleMySQLQueryMapper mapper;

  @Override
  public ArticleListQueryResponse list() {
    return new ArticleListQueryResponse(mapper.list());
  }
}
