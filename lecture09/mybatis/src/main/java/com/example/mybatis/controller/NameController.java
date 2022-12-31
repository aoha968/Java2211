package com.example.mybatis.controller;

import com.example.mybatis.model.Name;
import com.example.mybatis.service.NameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {
    private final NameService nameService;
    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    /**
     * Namesリストを取得する
     * @return Namesリスト
     */
    @GetMapping("/names")
    public List<String> getNames() {
        return nameService.findAll();
    }
}
