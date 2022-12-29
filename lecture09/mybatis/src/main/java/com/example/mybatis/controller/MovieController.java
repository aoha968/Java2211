package com.example.mybatis.controller;

import com.example.mybatis.model.Movie;
import com.example.mybatis.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    private final MovieService movieService;
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    /**
     * Moviesリストを取得する
     * @return Moviesリスト
     */
    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movieService.findAll();
    }

    /**
     * 指定した年のMoviesデータを取得する
     * @param publishedYear 公開された年
     * @return 指定した年をもつMoviesデータ
     */
    @GetMapping("/movies/{publishedYear}")
    public List<String> getMoviesByPublishedYear(@PathVariable long publishedYear){
        return movieService.findMoviesByPublishedYear(publishedYear);
    }
}
