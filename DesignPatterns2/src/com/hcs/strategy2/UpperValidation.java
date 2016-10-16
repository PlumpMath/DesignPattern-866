package com.hcs.strategy2;

import java.util.function.IntPredicate;

public class UpperValidation implements IntPredicate{

	@Override
	public boolean test(int value) {
		return Character.isUpperCase(value);
	}

}
