package com.example.minimumcqrssample.interfaces.api.like;

import com.example.minimumcqrssample.application.service.like.LikeApplicationService;
import com.example.minimumcqrssample.domain.model.article.ArticleId;
import com.example.minimumcqrssample.infrastructure.spring.security.SampleUserDetails;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles/{articleId}/likes")
@AllArgsConstructor
public class LikeCommandController {

  private LikeApplicationService service;

  @PostMapping
  public ResponseEntity<Void> post(@AuthenticationPrincipal SampleUserDetails sampleUserDetails,
                                   @PathVariable long articleId) {

    service.register(new ArticleId(articleId), sampleUserDetails.getUserId());

    // TODO return location
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

}
