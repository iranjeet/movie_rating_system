package com.example.page.dto.response;

import java.util.List;
import java.util.Set;

import com.example.page.domain.Movie;

public class ResGetDirector {
	private long id;
	private String name;
	private List<Movie> movie;
	public List<Movie> getMovie() {
		return movie;
	}
	public void setMovie(Set<Movie> set) {
		this.movie = (List<Movie>) set;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}