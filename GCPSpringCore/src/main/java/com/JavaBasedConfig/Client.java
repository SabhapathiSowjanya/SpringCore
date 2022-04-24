package com.JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
	Samsung s7=factory.getBean(Samsung.class);
	s7.config();
		

	}

}
