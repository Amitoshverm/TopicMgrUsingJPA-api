package com.example.managmenttopicwithdbsapi.LessonsApi;

import com.example.managmenttopicwithdbsapi.CoursesApi.Entity_Model.Course;
import com.example.managmenttopicwithdbsapi.Entity_Model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class LessonController {

    public Topic topic;
    @Autowired
    public LessonService lessonService;


    @RequestMapping ("/topic/{id}/courses/lessons")
    public List<Lesson> getAllLessons() {
        return lessonService.getAllLesson();
    }

    @RequestMapping("/topic/{id}/courses/lessons/name")
    public Lesson getLesson(String name) {
        return lessonService.getLesson(name);
    }

    @PostMapping("/topic/{topicId}/courses/lessons")
    public String addLesson(@RequestBody Lesson lesson){
        lessonService.addLesson(lesson);
        return "lesson added";
    }

    @PostMapping("/topic/{topicId}/courses/lessons/{id}")
    public String updateLesson(@RequestBody Lesson lesson, @PathVariable String id){
        lesson.setCourse(new Course(id, "", ""));
        return "lesson updated";
    }

    @DeleteMapping("/topic/{topicId}/courses/lessons/{id}")
    public void deleteLesson(@PathVariable String id) {
        lessonService.removeLesson(id);
    }

}
