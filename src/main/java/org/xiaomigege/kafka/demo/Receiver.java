package org.xiaomigege.kafka.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


/**
 * Created by mijun on 2017/6/23.
 */

@Component
public class Receiver {

    private Gson gson = new GsonBuilder().create();

    @KafkaListener(topics = "mij-test")
    public void processMessage(String content) {
        Message m = gson.fromJson(content, Message.class);
        System.out.println(m.getSendTime()+"-----"+m.getMsg());
    }
}
