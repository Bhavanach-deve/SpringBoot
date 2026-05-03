package com.example.LayeredApproach;

import com.example.LayeredApproach.entity.Electronics;
import com.example.LayeredApproach.serviceLayer.ElectricService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class LayeredApproachApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(LayeredApproachApplication.class, args);
		ElectricService service=container.getBean(ElectricService.class);

//		String status=service.registerGadgetInfo(new Electronics(20000.00,"Television","Videocon"));
//
//		System.out.println(status);

		Electronics e1=new Electronics(29000.00,"Television","LG");
		Electronics e2=new Electronics(27000.00,"Television","Sony");
		Electronics e3=new Electronics(35000.00,"Television","Samsung");

		List<Electronics> gadgets=new ArrayList<Electronics>();
		gadgets.add(e1);
		gadgets.add(e2);
		gadgets.add(e3);
		service.registerMultiGadgetInfo(gadgets).forEach(v-> System.out.println(v));




	}

}
