package io.javabrains.springbootstarter.course;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
import org.springframework.stereotype.Service;
Stereotype means *singleton*
 */
@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(
        CourseRepository courseRepository
    ) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>(
            courseRepository.findCoursesByTopicId(topicId)
        );
        System.out.printf("Got %d items.", courses.size());
        return courses;
    }

    public Course getCourse(String id) {
        return courseRepository.findById(id).orElseThrow();
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
