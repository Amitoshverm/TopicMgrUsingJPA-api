package com.example.managmenttopicwithdbsapi.Service;

import com.example.managmenttopicwithdbsapi.Entity_Model.Topic;
import com.example.managmenttopicwithdbsapi.Repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    public List<Topic> getAllTopic() {

        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
       //return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }


    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void remove(String id) {
        topicRepository.deleteById(id);
    }
}
