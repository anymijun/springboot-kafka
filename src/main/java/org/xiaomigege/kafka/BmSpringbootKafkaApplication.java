package org.xiaomigege.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.xiaomigege.kafka.demo.Message;
import org.xiaomigege.kafka.demo.Receiver;
import org.xiaomigege.kafka.demo.Sender;

@SpringBootApplication
public class BmSpringbootKafkaApplication {

	public static void main(String[] args) throws InterruptedException {

		ApplicationContext app = SpringApplication.run(BmSpringbootKafkaApplication.class, args);

		while(true){
			Sender sender = app.getBean(Sender.class);
			sender.sendMessage();
			Thread.sleep(2000);
		}
	}

}
