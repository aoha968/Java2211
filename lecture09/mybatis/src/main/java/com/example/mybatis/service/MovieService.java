package com.example.mybatis.service;

import com.example.mybatis.model.Movie;

import java.util.List;

public interface MovieService {
    /**
     * Movieを全て取得する
     * @return Moviesリスト
     */
    List<Movie> findAll();

    /**
     * 指定された年のMovieを取得する
     * @param publishedYear 公開された年
     * @return 指定された年のMovieをリストで返却する
     */
    List<String> findMoviesByPublishedYear(long publishedYear);
}
