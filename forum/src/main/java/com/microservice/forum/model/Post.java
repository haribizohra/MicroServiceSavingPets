package com.microservice.forum.model;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "author_id")
	private long author_id;

	public Post() {

	}

	public Post(String title, String description, long author_id) {
		this.title = title;
		this.description = description;
		this.author_id = author_id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(long author_id) {
		this.author_id = author_id;
	}

	@Override
	public String toString() {
		return "Post{" +
				"id=" + id +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				", author_id=" + author_id +
				'}';
	}
}
