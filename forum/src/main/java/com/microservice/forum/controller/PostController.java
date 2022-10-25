package com.microservice.forum.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.microservice.forum.model.Post;
import com.microservice.forum.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/forum")
public class PostController {

	@Autowired
	PostRepository postRepository;

	@GetMapping
	public String sayHello ( ) {
		return "Forum Microservice is working" ;
	}

	@GetMapping("/posts")
	public ResponseEntity<List<Post>> getAllPosts(@RequestParam(required = false) String title) {
		try {
			List<Post> posts = new ArrayList<>();

			if (title == null)
				posts.addAll(postRepository.findAll());
			else
				posts.addAll(postRepository.findByTitleContaining(title));

			if (posts.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(posts, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/posts/{id}")
	public ResponseEntity<Post> getPostById(@PathVariable("id") long id) {
		Optional<Post> postData = postRepository.findById(id);

		return postData.map(post -> new ResponseEntity<>(post, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PostMapping("/posts")
	public ResponseEntity<Post> createPost(@RequestBody Post post) {
		try {
			Post _post = postRepository
					.save(new Post(post.getTitle(), post.getDescription(), post.getAuthor_id()));
			return new ResponseEntity<>(_post, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/posts/{id}")
	public ResponseEntity<Post> updatePost(@PathVariable("id") long id, @RequestBody Post post) {
		Optional<Post> postData = postRepository.findById(id);

		if (postData.isPresent()) {
			Post _post = postData.get();
			_post.setTitle(post.getTitle());
			_post.setDescription(post.getDescription());
			_post.setAuthor_id(post.getAuthor_id());
			return new ResponseEntity<>(postRepository.save(_post), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/posts/{id}")
	public ResponseEntity<HttpStatus> deletePost(@PathVariable("id") long id) {
		try {
			postRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/posts")
	public ResponseEntity<HttpStatus> deleteAllPosts() {
		try {
			postRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}


}
