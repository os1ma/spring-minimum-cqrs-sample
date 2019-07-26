package com.example.minimumcqrssample.interfaces.api.auth;

import com.example.minimumcqrssample.infrastructure.spring.security.SampleUserDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO 修正
@RestController
@RequestMapping("/auth")
public class AuthController {

  @GetMapping
  public ResponseEntity<Void> auth() {
    SampleUserDetails ud = new SampleUserDetails();

    Authentication auth = new UsernamePasswordAuthenticationToken(
            ud, "password", ud.getAuthorities());
    SecurityContextHolder.getContext().setAuthentication(auth);

    return ResponseEntity.ok().build();
  }

}
