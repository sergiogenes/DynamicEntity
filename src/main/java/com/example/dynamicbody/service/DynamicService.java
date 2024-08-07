package com.example.dynamicbody.service;

import com.example.dynamicbody.model.DynamicEntity;
import com.example.dynamicbody.repository.DynamicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DynamicService {
    @Autowired
    private DynamicRepository repository;

    public DynamicEntity createEntity(Map<String, Object> data){
        DynamicEntity entity = new DynamicEntity();
        entity.setData(data);
        return repository.save(entity);
    }

    public List<DynamicEntity> getAllEntities(){
        return repository.findAll();
    }
}
