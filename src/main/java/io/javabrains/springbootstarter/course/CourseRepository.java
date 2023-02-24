package io.javabrains.springbootstarter.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
/*
JpaRepository is better than CrudRepository:
- the findAll() returns a List<> rather than an Iterable<>
 */
public interface CourseRepository extends JpaRepository<Course, String> {
//public interface CourseRepository extends CrudRepository<Course, String> {
    // JPA does these for you when extending CrudRepository/JpaRepository:
    // - getAllTopics()
    // - getTopic(String id)
    // - updateTopic(Topic topic)
    // - deleteTopic(String id)

    /*
    The method name follows a convention.
    Use IntelliSense popup after typing "find" to see auto-detected method names.

    You do not have to implement the method; Spring Data JPA generates the implementation.
     */
    public List<Course> findCourseByName(String name);

    public List<Course> findCoursesByTopicId(String topicId);

}
