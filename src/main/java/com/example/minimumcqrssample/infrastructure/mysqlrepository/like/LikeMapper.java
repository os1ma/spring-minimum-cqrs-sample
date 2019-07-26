package com.example.minimumcqrssample.infrastructure.mysqlrepository.like;

import com.example.minimumcqrssample.domain.model.like.Like;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LikeMapper {
  void save(Like like);
}
