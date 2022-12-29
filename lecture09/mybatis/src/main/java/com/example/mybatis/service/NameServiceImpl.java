package com.example.mybatis.service;

import com.example.mybatis.mapper.NameMapper;
import com.example.mybatis.model.Name;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameServiceImpl implements NameService {

    private final NameMapper nameMapper;
    public NameServiceImpl(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    /**
     * Nameを全て取得する
     * @return Nameリスト
     */
    @Override
    public List<String> findAll() {
        return nameMapper.findAll();
    }
}
