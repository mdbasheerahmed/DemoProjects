/**
 * 
 */
package com.basheer.java8.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.basheer.java8.LambdaExpressionExample;

/**
 * @author Basheer
 *
 */
public class LambdaExpressionExampleTest {


	int numbers[] = new int[10];
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		LambdaExpressionExample example = new LambdaExpressionExample();
		assertArrayEquals(new LambdaExpressionExampleTest().assignNumbers(), new LambdaExpressionExample().assignNumbers());
	}
	
private int[] assignNumbers(){
		
		for(int i=0; i<numbers.length; i++){
			numbers[i] = i;
		}
		return new int[10];
		
	}

}
