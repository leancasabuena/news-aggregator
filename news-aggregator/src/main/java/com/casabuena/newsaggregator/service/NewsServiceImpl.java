package com.casabuena.newsaggregator.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.casabuena.newsaggregator.domain.Response;
import com.casabuena.newsaggregator.domain.Result;

@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Result> getNews() {

		String newsAPIkey = "3d11b68721ca43ecbac03f669dfeebb2";// get a free API Key
		String url = "https://newsapi.org/v2/everything?q=bitcoin&from=2019-05-11&sortBy=publishedAt&apiKey="
				+ newsAPIkey;

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders);
		ResponseEntity<Response> responseResponseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity,
				Response.class);
		Response response = responseResponseEntity.getBody();

		List<Result> resultList = new ArrayList<Result>();
		for (Result result : response.getResults()) {
			resultList.add(result);
			if (resultList.size() > 2) {
				break;
			}
		}

		return resultList != null ? resultList : Collections.emptyList();
	}
}