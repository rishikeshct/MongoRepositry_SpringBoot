package com.codeatomic.springbootquickstart.topic;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepository extends MongoRepository<Topic, String> {
	
}
