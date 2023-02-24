package io.javabrains.springbootstarter.topic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TopicRepository extends JpaRepository<Topic, String> {
//public interface TopicRepository extends CrudRepository<Topic, String> {
    // JPA does these for you when extending CrudRepository:
    // - getAllTopics()
    // - getTopic(String id)
    // - updateTopic(Topic topic)
    // - deleteTopic(String id)
}
