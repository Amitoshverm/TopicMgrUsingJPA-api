package com.example.managmenttopicwithdbsapi.CoursesApi.Repository;

import com.example.managmenttopicwithdbsapi.CoursesApi.Entity_Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, String> {
    public List<Course> findByTopicId(String topicId);
}
