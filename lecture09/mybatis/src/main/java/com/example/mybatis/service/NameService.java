package com.example.mybatis.service;

import com.example.mybatis.model.Name;

import java.util.List;

public interface NameService {
    /**
     * Nameを全て取得する
     * @return Nameリスト
     */
    List<String> findAll();
}
