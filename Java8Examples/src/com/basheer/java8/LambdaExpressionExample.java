package com.basheer.java8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LambdaExpressionExample {
	
	private static final Logger logger = Logger.getLogger(LambdaExpressionExample.class.getName());
	private static final Logger log = Logger.getLogger(LambdaExpressionExample.class.getName());


	int numbers[] = new int[10];
	public static void main(String[] args) {
	
		logger.info("Coming in main method ");
		
		
		new LambdaExpressionExample().assignNumbers();

		new LambdaExpressionExample().printNumber();
		/*try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			logger.log(Level.SEVERE, "Exception Occured", e);
		}*/
	}
	
	public int[] assignNumbers(){
		
		for(int i=0; i<numbers.length; i++){
			numbers[i] = i;
		}
		return new int[10];
		
	}

	private void printNumber(){
		
		for(int i=0; i<numbers.length; i++){
			logger.info( "number @ position "+i+"is "+numbers[i]);
		}
		
	
	}
}
