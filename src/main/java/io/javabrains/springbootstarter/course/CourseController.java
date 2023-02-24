package io.javabrains.springbootstarter.course;

import io.javabrains.springbootstarter.topic.Topic;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    private final CourseService courseService;

    /*
    @Autowired makes Spring look in registry,
    sees that a CourseService @Service instance already exists, and injects it.
     */
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId) {
        return courseService.getAllCourses(topicId);
    }

    @GetMapping("/topics/{topicId}/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return courseService.getCourse(courseId);
    }

//    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    @PostMapping("/topics/{topicId}/courses/")
    public void addCourse(@PathVariable String topicId, @RequestBody Course course) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }

    @PutMapping("/topics/{topicId}/courses/{courseId}")
    public void updateTopic(@PathVariable String topicId, @RequestBody Course course) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }

    @DeleteMapping("/topics/{topicId}/courses/{courseId}")
    public void deleteTopic(@PathVariable String courseId) {
        courseService.deleteCourse(courseId);
    }
}
