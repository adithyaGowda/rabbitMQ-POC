package com.stackroute.controller;

import com.stackroute.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/producer")
public class ProducerController {

    @Autowired
    private MessageProducer messageProducer;

    @GetMapping
    public String producer(@RequestParam String message) {


        messageProducer.sendMessage(message);

        return "Message sent to rabbitMQ and message="+message;
    }
}
