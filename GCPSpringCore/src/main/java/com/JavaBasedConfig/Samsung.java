package com.JavaBasedConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	@Autowired
	//@Qualifier("sanpdragon")
	MobileProcessor CPU;

	public MobileProcessor getCPU() {
		return CPU;
	}

	public void setCPU(MobileProcessor cPU) {
		CPU = cPU;
	}
	
	public void config() {
		System.out.println("Octa core , 4gb Ram , 12mb camera");
		CPU.process();
	}

	
}
