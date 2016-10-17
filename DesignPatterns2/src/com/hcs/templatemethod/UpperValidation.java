package com.hcs.templatemethod;

public class UpperValidation extends Validation{

	@Override
	protected boolean check(char c) {
		return Character.isUpperCase(c);
	}

}
