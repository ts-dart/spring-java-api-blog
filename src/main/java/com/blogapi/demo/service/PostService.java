package com.blogapi.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogapi.demo.model.PostRepository;
import com.blogapi.demo.model.entities.PostEntity;
import com.blogapi.demo.service.interfaces.PostServiceInterface;

@Service
public class PostService implements PostServiceInterface {
  
  @Autowired
  private PostRepository postRepository;

  @Override
  public Iterable<PostEntity> getAll() {
    return postRepository.findAll();
  }

  @Override
  public Object getById(int id) {
    Optional<PostEntity> post = postRepository.findById(id);
    if (post.isPresent()) {
      return post.get();
    }
    return "Post not found";
  }

  @Override
  public void InsertNewPost(PostEntity post) {
    postRepository.save(post);
  }

  @Override
  public void UpdatePost(Integer id, PostEntity newPost) {
    Optional<PostEntity> post = postRepository.findById(id);
    if (!post.isPresent()) {
      postRepository.save(newPost);
    }
  }

  @Override
  public void DeletePost(Integer id) {
    postRepository.deleteById(id);
  }

}
  