package com.example.managmenttopicwithdbsapi.Controller;


import com.example.managmenttopicwithdbsapi.Entity_Model.Topic;
import com.example.managmenttopicwithdbsapi.Service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    /** READ */
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopic();
    }

    @RequestMapping ("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    /** CREATE */
    @PostMapping("/topics")
    public String addTopics(@RequestBody Topic topic) {
         topicService.addTopic(topic);
         return "topic added";
    }

    /** UPDATE */
    @PutMapping ("/topics/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
        topicService.updateTopic(id, topic);
    }

    /** DELETE */
    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.remove(id);
    }
}
