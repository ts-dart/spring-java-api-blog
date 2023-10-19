package com.blogapi.demo.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PostEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String title;
  private String content;

  @ManyToOne
  //@JoinColumn(id = "use_id")
  private int userId;
  private String published;
  private String updated;

  // Getters
  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }

  public int getUserId() {
    return userId;
  }

  public String getPublished() {
    return published;
  }

  public String getUpdated() {
    return updated;
  }

  // Setters
  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public void setPublished(String published) {
    this.published = published;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

}
