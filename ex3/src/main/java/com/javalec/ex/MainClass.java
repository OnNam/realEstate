package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	
	
	public static void main(String args[]){
		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyCalCulator cal  = ctx.getBean("MyCalCulator",MyCalCulator.class);
		
		System.out.println();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
		
	}
}
