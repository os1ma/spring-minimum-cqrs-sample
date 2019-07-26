package com.example.minimumcqrssample.infrastructure.mysqlrepository.like;

import com.example.minimumcqrssample.domain.model.like.Like;
import com.example.minimumcqrssample.domain.model.like.LikeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class LikeMySQLRepository implements LikeRepository {

  private LikeMapper likeMapper;

  @Override
  public void save(Like like) {
    likeMapper.save(like);
  }
}
