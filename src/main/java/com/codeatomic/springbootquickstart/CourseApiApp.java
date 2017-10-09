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
				new Topic("spring", "Spring Framework", "Spring framework description.",Arrays.asList(new Topic.Content("JAVA CORE CONCEPTS", "JAVA"))),
				new Topic("java", "Core Java", "Core Java description.",Arrays.asList(new Topic.Content("JAVA CORE CONCEPTS", "JAVA CORE CONCEPTS"))),
				new Topic("php", "Core PHP", "Core PHP description.",Arrays.asList(new Topic.Content("JAVA CORE CONCEPTS", "JAVA CORE CONCEPTS")))
				));
		topicRepository.save(topics);
		
		System.out.println("-----------------------------------------------------------------------");
		for(Topic topic: topics ){
			//System.out.println("Topic ID: "+ topic.getId() +" and Topic Name: "+topic.getName()+" and Topic Description" + topic.getDescription());
			System.out.println(String.format("%-10s= %-10s %s= %-20s %s= %s" ,"Topic ID: ",topic.getId(),"Topic Name:", topic.getName(),"Topic Description", topic.getDescription()));
		}
		System.out.println("-----------------------------------------------------------------------");
		
		Topic topic = new Topic();
	
		for(Topic topic1: topicRepository.findByTopicContentTopicContent("JAVA CORE CONCEPTS") ){
			//System.out.println("Topic ID: "+ topic.getId() +" and Topic Name: "+topic.getName()+" and Topic Description" + topic.getDescription());
			System.out.println(String.format("%-10s= %-10s %s= %-20s %s= %s" ,"Topic ID: ",topic1.getId(),"Topic Name:", topic1.getName(),"Topic Description", topic1.getDescription()));
		}
	}

}
