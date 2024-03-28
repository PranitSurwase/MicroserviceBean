package com.example.PranitMicroService_24;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.example.PranitMicroService_24.beans.Network;
import com.example.PranitMicroService_24.beans.Phone;
import com.example.PranitMicroService_24.beans.SimCard;
import com.example.PranitMicroService_24.beans.SimCard2;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.PranitMicroService_24.beans" })
public class PranitMicroService24Application {

	public static void main(String[] args) {

		
		//Main .run
		ConfigurableApplicationContext container = SpringApplication.run(PranitMicroService24Application.class, args);
		SimCard2 sim = container.getBean(SimCard2.class);
		System.out.println("hello for Boot");
		System.out.println("This is a bean stored in variable and  created by @component:" + sim);

		// This is XmlBaseConfiguration---for achieving it we create file in resources
		// config.xml
		// we create file network without @component annotation
		// we configure this by using ClassPathXmlApplicatitionContext.
		// we get bean ....it is actually typecasted here to network for convenience.
		// rather, network is of type Object

		
		//xml based new container which is manual using applicationContext!
//		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//		// Network bean_network =(Network)applicationContext.getBean("network");
//		// System.out.println(bean_network);
//
//		Phone phone = applicationContext.getBean("phone", Phone.class);
//		System.out.println(phone);
//		System.out.println(phone.network);

	}

}
