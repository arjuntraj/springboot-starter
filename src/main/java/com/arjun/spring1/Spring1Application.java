package com.arjun.spring1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.arjun.spring1.sub1.SprintComponent;

@SpringBootApplication
public class Spring1Application {

	private static SprintComponent bean;

	public static void main(String[] args) {
	ConfigurableApplicationContext context = 	SpringApplication.run(Spring1Application.class, args);
	bean = context.getBean(SprintComponent.class);
	
 	System.out.print(bean.getMessage());
	//System.out.println("edsd");
	}

}
