package com.stackroute.listener;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MessageListenerIImpl implements MessageListenerI {

    @Override
    public void onMessage(String message) {
        System.out.println(new Date());
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Message Recieved: "+message);
    }
}
