package example;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	Calculator cal=new Calculator();

	@Test
	public void testAdd1() {
	assertEquals(10,cal.add1(6, 4));
		
	}

	@Test
	public void testMul1() {
	assertnotEquals(10,cal.sub1(5, 2));
	}

	private void assertnotEquals(int i, int add1) {
		
	}
	

	@Test
	public void testsub1() {
	assertnull(25,cal.add1(6, 4));
		
	}

	private void assertnull(int i, int add1) {
		
		
	}
}