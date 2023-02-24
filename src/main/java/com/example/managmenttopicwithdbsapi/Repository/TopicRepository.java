package com.example.managmenttopicwithdbsapi.Repository;

import com.example.managmenttopicwithdbsapi.Entity_Model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, String> {
}
