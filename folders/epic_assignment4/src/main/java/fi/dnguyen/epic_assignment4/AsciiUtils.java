package fi.dnguyen.epic_assignment4;

public class AsciiUtils {
	
	public final static int BASE_OCTAL = 8;
	public final static int BASE_DECIMAL = 10;
	public final static int BASE_HEX = 16;

	/**
	 * Given an integer and its base, convert the value to ASCII string.
	 * If base is 10 and value is negative, the resulting string is preceded with a minus sign (-). 
	 * With any other base, value is always considered unsigned.
	 * 
	 * @param value integer to convert to ASCII
	 * @param base octal, decimal or hex base
	 * @return converted string
	 */
	public static String itoa(int value, int base) {
		if (value == 0) {
			return "0";
		}
		
		String str = "";
		
		boolean isNegative = value < 0;
		if (isNegative) {
			value = -value;
		}
		
		// process individual digits
		while (value != 0) {
			int remainder = value % base;
			value = value/base; 
			
			str += (remainder > 9) 
					? Character.toString((char) ((remainder - 10) + 'a'))
					: Character.toString((char) (remainder + '0'));
		}
		
		// reverse the string
		String reverse = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}	
		str = reverse;
		
		// append '-' sign if negative and base 10
		if (isNegative && AsciiUtils.BASE_DECIMAL == base) 
	        str = "-" + str;
		
		return str;
	}
}
