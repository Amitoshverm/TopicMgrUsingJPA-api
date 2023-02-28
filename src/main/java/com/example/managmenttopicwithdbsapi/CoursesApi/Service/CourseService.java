package com.example.managmenttopicwithdbsapi.CoursesApi.Service;

import com.example.managmenttopicwithdbsapi.CoursesApi.Repository.CourseRepository;
import com.example.managmenttopicwithdbsapi.CoursesApi.Entity_Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId);
        courseRepository.findAll()
                .forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id) {
       //return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }


    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void removeCourse(String id) {
        courseRepository.deleteById(id);
    }
}
