package pkgBase;

import static org.junit.Assert.*;

import org.junit.Test;

import base.MyInteger;

public class TestMyInt {

	@Test
	public void test() {
		
		MyInteger int1 = new MyInteger(17);
		boolean oddExp = true;
		boolean primeExp = true;
		
		assertEquals(int1.isOdd(), oddExp);
		assertEquals(int1.isPrime(), primeExp);
		
	}

}
