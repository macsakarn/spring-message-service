package com.example.springmessageservice.repository;


import com.example.springmessageservice.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> findAll(){
        return messageRepository.findAll();
    }

}
