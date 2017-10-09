package com.codeatomic.springbootquickstart.topic;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepository extends MongoRepository<Topic, String> {
	public List<Topic> findByTopicContentTopicContent(String topicDescription);
}
