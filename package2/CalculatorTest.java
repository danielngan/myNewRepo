package package2;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {

	@Test 
	public void test() {
		double a = Calculator.add(3.0, 4.0);
		double aExpected = 7.0;
		double b = Calculator.minus(7.5, 3.2);
		double bExpected = 4.3;
		double c = Calculator.multiply(6.5, 2.0);
		double cExpected =13.0;
		double d = Calculator.divide(7.5, 2);
		double dExpected = 3.75;
		double e = Calculator.power(2.0, 3.0);
		double eExpected = 8.0;
		double f = Calculator.log(100);
		double fExpected = 2;
		double g = Calculator.ln(Math.E);
		double gExpected = 1;
		Assert.assertEquals(aExpected, a, 0.1);
		Assert.assertEquals(bExpected, b, 0.1);
		Assert.assertEquals(cExpected, c, 0.1);
		Assert.assertEquals(dExpected, d, 0.1);
		Assert.assertEquals(eExpected, e, 0.1);
		Assert.assertEquals(fExpected, f, 0.1);
		Assert.assertEquals(gExpected, g, 0.1);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test2() {
		Calculator.divide(7.0, 0.0);
		
	}
	
	
	
	

}
