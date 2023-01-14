package com.example.mybatis.mapper;

import com.example.mybatis.model.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MovieMapper {
    /**
     * Movieを全て取得する
     * @return Moviesリスト
     */
    @Select("SELECT * FROM movies")
    List<Movie> findAll();

    /**
     * 指定された年のMovieを取得する
     * @param publishedYear 公開された年
     * @return 指定された年のMovieをリストで返却する
     */
    @Select("SELECT name FROM movies WHERE published_year=#{publishedYear}")
    List<String> findMoviesByPublishedYear(int publishedYear);
}
