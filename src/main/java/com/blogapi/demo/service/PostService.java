package com.blogapi.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogapi.demo.model.PostRepository;

@Service
public class PostService {
  
  @Autowired
  private PostRepository postRepository;

}
