package com.blogapi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

import com.blogapi.demo.model.entities.PostEntity;
import com.blogapi.demo.service.PostService;

@RestController
@RequestMapping("post")
public class PostController { 
  
  @Autowired
  private PostService postService;

  @GetMapping
  public ResponseEntity<Iterable<PostEntity>> getAll() {
    return ResponseEntity.ok(postService.getAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Object> getById(@PathVariable Integer id) {
    return ResponseEntity.ok(postService.getById(id));
  }
  
  @PostMapping
  public ResponseEntity<PostEntity> InsertNewPost(@RequestBody PostEntity post) {
    postService.InsertNewPost(post);
    return ResponseEntity.ok(post);
  }

  @PutMapping("/{id}")
  public ResponseEntity<PostEntity> UpdatePost(@PathVariable Integer id, @RequestBody PostEntity post) {
    postService.UpdatePost(id, post);
    return ResponseEntity.ok(post);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<PostEntity> DeletPost(@PathVariable Integer id) {
    postService.DeletePost(id);
    return ResponseEntity.ok().build();
  }

}
