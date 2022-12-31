package com.example.mybatis.service;

import com.example.mybatis.mapper.MovieMapper;
import com.example.mybatis.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieMapper movieMapper;
    public MovieServiceImpl(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    /**
     * Movieを全て取得する
     * @return Movieリスト
     */
    @Override
    public List<Movie> findAll() {
        return movieMapper.findAll();
    }

    /**
     * 指定された年のMovieを取得する
     * @param publishedYear 公開された年
     * @return 指定された年のMovieをリストで返却する
     */
    @Override
    public List<String> findMoviesByPublishedYear(int publishedYear) {
        return movieMapper.findMoviesByPublishedYear(publishedYear);
    }
}
