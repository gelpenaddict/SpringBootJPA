package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
import org.springframework.stereotype.Service;
Stereotype means *singleton*
 */
@Service
public class TopicService {

    private final TopicRepository topicRepository;

    public TopicService(
        TopicRepository topicRepository
    ) {
        this.topicRepository = topicRepository;
    }

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository
            .findAll()
            .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id).orElseThrow();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
