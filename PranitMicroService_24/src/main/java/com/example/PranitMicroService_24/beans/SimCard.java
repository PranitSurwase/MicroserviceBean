package com.example.PranitMicroService_24.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//This is a Bean  Created using @component using --java code  same as Sim2
//"InitializingBean+afterPropertiesSet()" & "DisposableBean+destroy()" 
//works Same as Annotations "PostConstruct" & "PreDestroy".
public class SimCard {
	public SimCard() {
		System.out.println("This is a Bean of Type SimCard");
	}
	
	
	/*
	 * The <code>PostConstruct</code> annotation is used on a method that needs to
	 * be executed after dependency injection is done to perform any initialization
	 */
	@PostConstruct
	public void init() 
	{
		System.out.println("Initializing---->");
	}
  
	/**
	 * The <code>PreDestroy</code> annotation is used on a method as a
	 * callback notification to signal that the instance is in the
	 * process of being removed by the container. The method annotated
	 * with <code>PreDestroy</code> is typically used to
	 * release resources that it has been holding.
	 * */
	
	@PreDestroy
	public void destroy() 
	{
		System.out.println("The Bean is going to be Destroyed");
	}
}
