package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class GcpSpringCoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GcpSpringCoreApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringIOC.xml");
		//Vehicle obj=(Vehicle)context.getBean("car");
		//obj.drive();
		
		//Tyre tyreobj=(Tyre)context.getBean("tyre");
		//System.out.println(tyreobj);
		//tyreobj.display();
		
		Vehicle obj=(Vehicle)context.getBean("car");
		obj.drive();
	}

}
