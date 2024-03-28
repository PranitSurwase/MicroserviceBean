package com.example.PranitMicroService_24.beans;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


@Component
//This is a Bean Created using @component using --implementation of interfaces same as Sim1
//"InitializingBean+afterPropertiesSet()" & "DisposableBean+destroy()"
//works Same as Annotations "PostConstruct" & "PreDestroy".
public class SimCard2 implements InitializingBean,DisposableBean{
	public SimCard2() {
		System.out.println("This is a Bean of Type SimCard2");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing---->2");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("The Bean is going to be Destroyed2");
    
		
	}

}
