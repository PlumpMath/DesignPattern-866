package com.hcs.strategy2;

import java.util.function.IntPredicate;

public class LowerValidation implements IntPredicate{

	@Override
	public boolean test(int value) {
		return Character.isLowerCase(value);
	}

}
