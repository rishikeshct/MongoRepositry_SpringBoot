package com.codeatomic.springbootquickstart.topic;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Topic")
public class Topic {

	@Id
	private String id;
	private String name;
	private String description;
	private List<Content> topicContent;
	public Topic() {

	}

	public Topic(String id, String name, String description,List<Content> topicContent) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topicContent  = topicContent;
	}

	public static class Content {

		private String topicContent;
		private String topicDescription;

		public Content(String topicContent, String topicDescription) {
			// TODO Auto-generated constructor stub
			this.topicContent = topicContent;
			this.topicDescription= topicDescription;
			
		}

		public String getTopicContent() {
			return topicContent;
		}

		public void setTopicContent(String topicContent) {
			this.topicContent = topicContent;
		}

		public String getTopicDescription() {
			return topicDescription;
		}

		public void setTopicDescription(String topicDescription) {
			this.topicDescription = topicDescription;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
