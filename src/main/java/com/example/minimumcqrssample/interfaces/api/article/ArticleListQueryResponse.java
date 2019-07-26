package com.example.minimumcqrssample.interfaces.api.article;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ArticleListQueryResponse {
  private List<Article> articles;

  @Data
  @AllArgsConstructor
  public static class Article {
    private String title;
    private String authorName;
    private long likeCount;
  }
}

