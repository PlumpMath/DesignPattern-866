package com.hcs.templatemethod;

public class LowerValidation extends Validation{

	@Override
	protected boolean check(char c) {
		return Character.isLowerCase(c);
	}

}
