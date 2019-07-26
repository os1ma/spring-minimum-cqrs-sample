package com.example.minimumcqrssample.domain.model.article;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class ArticleId {
  private long value;
}
