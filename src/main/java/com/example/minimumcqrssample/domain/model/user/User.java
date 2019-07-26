package com.example.minimumcqrssample.domain.model.user;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class User {
  private UserId id;
  private String name;
}
