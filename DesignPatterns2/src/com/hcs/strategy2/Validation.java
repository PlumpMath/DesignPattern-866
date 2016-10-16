package com.hcs.strategy2;

import java.util.function.IntPredicate;

//Context
public class Validation {
	
	private IntPredicate validationStrategy;
	
	public Validation(IntPredicate validationStrategy){
		this.validationStrategy = validationStrategy;
	}
	
	public boolean validate(String s){
		return s.chars().allMatch(validationStrategy);
	}

}
