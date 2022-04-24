package com.JavaBasedConfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTech implements MobileProcessor{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("best CPU from MediaTech");
		
	}
	

}
