package com.blogapi.demo.service.interfaces;

import com.blogapi.demo.model.entities.PostEntity;

public interface PostServiceInterface {
  Iterable<PostEntity> getAll();
  Object getById(Integer id); 
  void InsertNewPost(PostEntity post); 
  void UpdatePost(Integer id, PostEntity newPost);
  void DeletePost(Integer id);
}
