package com.example.managmenttopicwithdbsapi.LessonsApi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, String> {
}
