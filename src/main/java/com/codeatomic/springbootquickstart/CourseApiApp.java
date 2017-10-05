package com.codeatomic.springbootquickstart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codeatomic.springbootquickstart.topic.Topic;
import com.codeatomic.springbootquickstart.topic.TopicRepository;

@SpringBootApplication
public class CourseApiApp implements CommandLineRunner{

	
	@Autowired
	private TopicRepository topicRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		List<Topic> topics = new ArrayList<>(Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring framework description."),
				new Topic("java", "Core Java", "Core Java description."),
				new Topic("php", "Core PHP", "Core PHP description.")
				));
		topicRepository.save(topics);
	}

}
