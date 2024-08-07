package com.example.dynamicbody.repository;

import com.example.dynamicbody.model.DynamicEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DynamicRepository extends MongoRepository<DynamicEntity, String> {
}
