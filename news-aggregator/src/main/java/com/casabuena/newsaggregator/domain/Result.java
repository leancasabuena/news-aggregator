package com.casabuena.newsaggregator.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {
	
	@JsonProperty("title")
	private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("author")
    private String author;
	
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}