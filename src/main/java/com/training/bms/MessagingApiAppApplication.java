package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MessagingApiAppApplication {
	
	
	public void printGreetings() {
		System.out.println("Hi oracle!!");
	}
	
	@GetMapping("day")
	public String getDay(){
		return "Todya is friday";
	}

	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		MessagingApiAppApplication a=new MessagingApiAppApplication();
		a.printGreetings();
	}

}
