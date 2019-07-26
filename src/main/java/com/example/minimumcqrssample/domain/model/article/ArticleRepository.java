package com.example.minimumcqrssample.domain.model.article;

import java.util.Optional;

public interface ArticleRepository {
  Optional<Article> findById(ArticleId articleId);
}
