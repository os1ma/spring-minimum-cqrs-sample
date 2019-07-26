package com.example.minimumcqrssample.infrastructure.spring.security;

import com.example.minimumcqrssample.domain.model.user.UserId;
import lombok.Getter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

// TODO 実装
@Getter
public class SampleUserDetails extends User {

  private UserId userId = new UserId(1);

  public SampleUserDetails() {
    super("user", "password",
            AuthorityUtils.createAuthorityList("ROLE_USER"));
  }
}
