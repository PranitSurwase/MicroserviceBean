package com.example.PranitMicroService_24.beans;

public class Phone {
	//const based dependencies injection
	public Network network;

	//setter based injection configured by xml .
	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		System.out.println("object creation using setter in phone of network");
		this.network = network;
	}
	
	
	/* this was constructor based dependency injection using xml config we configured method using 
	    ref value and type also injected network dependencies in Phone using xml config * */

	
//	public Phone(Network network) {
//		System.out.println("creating phone using constructor dependencies");
//		this.network = network;
//	}
//	
//	public Phone(int a,double b) {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println("second const");
//	}
	
	
	
	/*Now we are using setter based injection*/
	
	
	
	

}
