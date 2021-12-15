package com.example.springmessageservice.controller;


import com.example.springmessageservice.pojo.Message;
import com.example.springmessageservice.repository.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/get/messages")
    public ResponseEntity<?> getMessage(){
        List<Message> messageList = messageService.findAll();
        return ResponseEntity.ok(messageList);
    }

    @RequestMapping(value = "/test")
    public String getTest(){
        return "You look to good";
    }

}
