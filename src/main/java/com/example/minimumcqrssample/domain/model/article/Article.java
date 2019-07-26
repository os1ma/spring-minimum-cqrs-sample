package com.example.minimumcqrssample.domain.model.article;

import com.example.minimumcqrssample.domain.model.user.UserId;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class Article {
  private ArticleId id;
  private UserId userId;
  private String title;

  public ArticleId id() {
    return this.id;
  }

  public boolean writtenBy(UserId userId) {
    return this.userId.equals(userId);
  }
}
