package com.blogapi.demo.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogapi.demo.model.entities.PostEntity;

@Repository
public interface PostRepository extends CrudRepository<PostEntity, String> {
  
}
