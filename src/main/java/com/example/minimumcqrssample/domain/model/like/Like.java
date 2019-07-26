package com.example.minimumcqrssample.domain.model.like;

import com.example.minimumcqrssample.domain.model.article.Article;
import com.example.minimumcqrssample.domain.model.article.ArticleId;
import com.example.minimumcqrssample.domain.model.user.UserId;
import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class Like {

  /**
   * Factory.
   */
  public static Like of(Article article, UserId userId) {
    if (article.writtenBy(userId)) {
      // TODO 例外ハンドリング
      throw new IllegalArgumentException();
    }
    return new Like(article.getId(), userId);
  }

  private ArticleId articleId;
  private UserId userId;
}
