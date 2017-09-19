package com.log4j.example;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jBasicExample {

	static final Logger logger = Logger.getLogger(Log4jBasicExample.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			BasicConfigurator.configure();
			logger.debug("Hello World!");
	}

}
