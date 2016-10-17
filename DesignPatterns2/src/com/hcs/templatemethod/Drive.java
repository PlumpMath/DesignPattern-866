package com.hcs.templatemethod;

public class Drive {

	public static void main(String[] args) {
		Validation validation = new LowerValidation();
		System.out.println("isLower (aaa): " + validation.validate("aaa"));
		System.out.println("isLower (aaaA): " + validation.validate("aaaA"));
		
		validation = new UpperValidation();
		System.out.println("isUpper (AAA): " + validation.validate("AAA"));
		System.out.println("isUpper (aaaA): " + validation.validate("aaaA"));
		
		validation = new DigitValidation();
		System.out.println("isDigit (AAAa1): " + validation.validate("AAAa1"));
		System.out.println("isDigit (1123): " + validation.validate("1123"));
		
	}

}
