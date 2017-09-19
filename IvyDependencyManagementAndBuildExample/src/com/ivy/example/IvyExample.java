package com.ivy.example;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class IvyExample {

	static final Logger logger = Logger.getLogger(IvyExample.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		logger.info("Logging working");
	}

}
