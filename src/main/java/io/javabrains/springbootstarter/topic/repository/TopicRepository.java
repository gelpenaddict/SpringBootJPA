package io.javabrains.springbootstarter.topic.repository;

import io.javabrains.springbootstarter.topic.entity.TopicEntity;
import org.springframework.data.repository.CrudRepository;


public interface TopicRepository extends CrudRepository<TopicEntity, String> {
    // JPA does these for you when extending CrudRepository:
    // - getAllTopics()
    // - getTopic(String id)
    // - updateTopic(Topic topic)
    // - deleteTopic(String id)
}
