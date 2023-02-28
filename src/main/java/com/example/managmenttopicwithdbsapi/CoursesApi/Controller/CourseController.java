package com.example.managmenttopicwithdbsapi.CoursesApi.Controller;


import com.example.managmenttopicwithdbsapi.CoursesApi.Service.CourseService;
import com.example.managmenttopicwithdbsapi.CoursesApi.Entity_Model.Course;
import com.example.managmenttopicwithdbsapi.Entity_Model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    /** READ */
    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id) {
        return courseService.getAllCourses(id);
    }

    @RequestMapping ("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }

    /** CREATE */
    @PostMapping("/topics/{topicId}/courses")
    public String addTopics(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
         courseService.addCourse(course);
         return "course added";
    }

    /** UPDATE */
    @PutMapping ("/topics/{topicId}/courses/{id}")
    public void updateCourse(@PathVariable String topicId, @RequestBody Course course) {
        course.setTopic(new Topic(topicId,"", ""));
        courseService.updateCourse(course);
    }

    /** DELETE */
    @DeleteMapping("/topics/{topicId}/courses/{id}")
    public void deleteTopic(@PathVariable String id) {
        courseService.removeCourse(id);
    }
}
