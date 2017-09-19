package com.log4j.example;

import org.apache.log4j.Logger;

public class Log4jFromProperties {
	
	private static org.apache.log4j.Logger log = Logger
		    .getLogger(Log4jFromProperties.class);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.trace("Trace");
		log.debug("Debug");
		log.info("Info");
		log.warn("Warn");
		log.error("Error");
		log.fatal("Fatal");

	}

}
