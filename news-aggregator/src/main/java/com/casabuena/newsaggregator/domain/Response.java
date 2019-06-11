package com.casabuena.newsaggregator.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
	@JsonProperty("articles")
	private List<Result> results;

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}
}