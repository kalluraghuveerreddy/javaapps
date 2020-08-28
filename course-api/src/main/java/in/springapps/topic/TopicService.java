package in.springapps.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Java", "J2EE", "Java Development"),
			new Topic("Spring", "Spring MVC", "Spring Development"),
			new Topic("Spring Boot", "Spring Boot Quick Start", "Spring Boot Development"),
			new Topic("Hibernate", "JPA", "JPA Development")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		for (Topic t : topics) {
			if (t.getId().equalsIgnoreCase(id)) {
				return t;
			}
		}
		return null;
	}

	public void addTopic(Topic topic) {
		topics.add(topic);

	}

	public void updateTopic(String id, Topic topic) {

		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equalsIgnoreCase(id)) {
				topics.set(i, topic);
			}
		}

	}

	public List<Topic> deleteTopic(String id) {
		
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equalsIgnoreCase(id)) {
				topics.remove(t);
				return topics;
			}
		}
		return null;
		
	}

}
