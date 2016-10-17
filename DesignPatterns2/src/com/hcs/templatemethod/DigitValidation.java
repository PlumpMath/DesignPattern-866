package com.hcs.templatemethod;

public class DigitValidation extends Validation{

	@Override
	protected boolean check(char c) {
		return Character.isDigit(c);
	}

}
