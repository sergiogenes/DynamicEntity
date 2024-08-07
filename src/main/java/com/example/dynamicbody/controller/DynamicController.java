package com.example.dynamicbody.controller;

import com.example.dynamicbody.model.DynamicEntity;
import com.example.dynamicbody.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/entity")
public class DynamicController {

    @Autowired
    private DynamicService service;

    @GetMapping
    public List<DynamicEntity> getAllEntities(){
        return service.getAllEntities();
    }

    @PostMapping("/create")
    public DynamicEntity createEntity(@RequestBody Map<String, Object> data){
        return service.createEntity(data);
    }
}
