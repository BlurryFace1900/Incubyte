package test;

import junit.framework.Assert;
import main.StringCalculator;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	
	private StringCalculator st;
	
	@Before
	public void setup(){
		st = new StringCalculator();
	}
	
	@Test
	public void testAddEmpty(){
		
		String str = "";
		
		Assert.assertEquals(0, st.add(str));
	}
}
