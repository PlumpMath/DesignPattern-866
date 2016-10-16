package com.hcs.strategy2;

import java.util.function.IntPredicate;

public class DigitValidation implements IntPredicate{

	@Override
	public boolean test(int value) {
		return Character.isDigit(value);
	}

}
