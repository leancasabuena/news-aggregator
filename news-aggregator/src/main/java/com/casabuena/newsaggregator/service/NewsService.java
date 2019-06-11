package com.casabuena.newsaggregator.service;

import java.util.List;

import com.casabuena.newsaggregator.domain.Result;

public interface NewsService {
    List<Result> getNews();
}
