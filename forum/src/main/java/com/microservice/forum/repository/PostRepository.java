package com.microservice.forum.repository;

import java.util.List;

import com.microservice.forum.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
	List<Post> findByTitleContaining(String title);
}
