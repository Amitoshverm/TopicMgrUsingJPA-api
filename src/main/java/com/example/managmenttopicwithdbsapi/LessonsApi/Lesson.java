package com.example.managmenttopicwithdbsapi.LessonsApi;

import com.example.managmenttopicwithdbsapi.CoursesApi.Entity_Model.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lesson {
    @Id
    private String id;
    private String description;

    @ManyToOne
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Lesson( String id, String description) {

        this.id = id;
        this.description = description;
    }

    public Lesson() {

    }

    public String getName() {
        return id;
    }

    public void setName(String name) {
        this.id = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
