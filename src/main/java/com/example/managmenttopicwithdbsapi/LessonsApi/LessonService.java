package com.example.managmenttopicwithdbsapi.LessonsApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    public List<Lesson> getAllLesson() {
        List<Lesson> lessons = new ArrayList<>();
        lessonRepository.findAll()
                .forEach(lessons::add);
        return lessons;
    }

    public Lesson getLesson(String id) {
        return lessonRepository.findById(id).get();
    }
    public void addLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public void updateLesson(String id, Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public void removeLesson(String id) {
        lessonRepository.deleteById(id);
    }
}
