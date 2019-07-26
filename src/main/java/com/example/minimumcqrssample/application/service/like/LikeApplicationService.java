package com.example.minimumcqrssample.application.service.like;

import com.example.minimumcqrssample.application.exception.BadRequestException;
import com.example.minimumcqrssample.domain.model.article.Article;
import com.example.minimumcqrssample.domain.model.article.ArticleId;
import com.example.minimumcqrssample.domain.model.article.ArticleRepository;
import com.example.minimumcqrssample.domain.model.like.Like;
import com.example.minimumcqrssample.domain.model.like.LikeRepository;
import com.example.minimumcqrssample.domain.model.user.UserId;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class LikeApplicationService {

  private LikeRepository likeRepository;
  private ArticleRepository articleRepository;

  public void register(ArticleId articleId, UserId userId) {
    Article article = articleRepository.findById(articleId)
            .orElseThrow(BadRequestException::new);

    Like like = Like.of(article, userId);

    likeRepository.save(like);
  }

}
