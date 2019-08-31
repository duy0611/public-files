package fi.dnguyen.epic_assignment4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AsciiUtilsTest {

	@Test
	public void itoa_convertCorrectlyTest() {
		int value = 1567;
		
		String baseDecimal = "1567";
		String baseOctal = "3037";
		String baseHex = "61f";
		
		assertEquals(baseDecimal, AsciiUtils.itoa(value, AsciiUtils.BASE_DECIMAL));
		assertEquals(baseOctal, AsciiUtils.itoa(value, AsciiUtils.BASE_OCTAL));
		assertEquals(baseHex, AsciiUtils.itoa(value, AsciiUtils.BASE_HEX));
	}
	
	@Test
	public void itoa_negativeValueTest() {
		int value = -1234;
		
		String baseDecimal = "-1234";
		String baseOctal = "2322";
		String baseHex = "4d2";
		
		assertEquals(baseDecimal, AsciiUtils.itoa(value, AsciiUtils.BASE_DECIMAL));
		assertEquals(baseOctal, AsciiUtils.itoa(value, AsciiUtils.BASE_OCTAL));
		assertEquals(baseHex, AsciiUtils.itoa(value, AsciiUtils.BASE_HEX));
	}
	
	@Test
	public void itoa_zeroValueTest() {
		int value = 0;
		
		String baseDecimal = "0";
		String baseOctal = "0";
		String baseHex = "0";
		
		assertEquals(baseDecimal, AsciiUtils.itoa(value, AsciiUtils.BASE_DECIMAL));
		assertEquals(baseOctal, AsciiUtils.itoa(value, AsciiUtils.BASE_OCTAL));
		assertEquals(baseHex, AsciiUtils.itoa(value, AsciiUtils.BASE_HEX));
	}
}
