package com.hcs.strategy2;

public class Drive {

	public static void main(String[] args) {
		System.out.println(new Validation(new UpperValidation()).validate("AAAA"));
		
		Validation validation = new Validation(new UpperValidation());
		System.out.println("Upper validation: " + validation.validate("AAAA"));
		System.out.println("Upper validation: " + validation.validate("AAAAb"));
		
		validation = new Validation((a->Character.isDigit(a)));
		System.out.println("Digit validation: " + validation.validate("dfsf"));
		System.out.println("Digit validation: " + validation.validate("111"));
		
	}

}
