package io.javabrains.springbootstarter.topic.service;

import io.javabrains.springbootstarter.topic.entity.TopicEntity;
import io.javabrains.springbootstarter.topic.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
import org.springframework.stereotype.Service;
Stereotype means *singleton*
 */
@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    public List<TopicEntity> getAllTopics() {
        List<TopicEntity> topicEntities = new ArrayList<>();
        topicRepository
                .findAll()
                .forEach(topicEntities::add);
        return topicEntities;
    }

    public TopicEntity getTopic(String id) {
        return topicRepository.findById(id).orElseThrow();
    }

    public void addTopic(TopicEntity topicEntity) {
        topicRepository.save(topicEntity);
    }

    public void updateTopic(String id, TopicEntity topicEntity) {
        topicRepository.save(topicEntity);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
