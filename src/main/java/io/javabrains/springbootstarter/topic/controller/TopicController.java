package io.javabrains.springbootstarter.topic.controller;

import io.javabrains.springbootstarter.topic.entity.TopicEntity;
import io.javabrains.springbootstarter.topic.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<TopicEntity> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    @GetMapping("/topics/{id}")
    public TopicEntity getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    @PostMapping("/topics")
    public void addTopic(@RequestBody TopicEntity topicEntity) {
        topicService.addTopic(topicEntity);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody TopicEntity topicEntity) {
        topicService.updateTopic(id, topicEntity);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
