package com.example.page.dto.request;

import java.util.List;

public class ReqGetAllMovies {
	private List<Long> id;

	public List<Long> getId() {
		return id;
	}

	public void setId(List<Long> id) {
		this.id = id;
	}

}
