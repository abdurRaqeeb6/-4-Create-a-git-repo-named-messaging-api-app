package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingApiAppApplication {
	
	
	public void printGreetings() {
		System.out.println("Hi oracle!!");
	}

	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		MessagingApiAppApplication a=new MessagingApiAppApplication();
		a.printGreetings();
	}

}
