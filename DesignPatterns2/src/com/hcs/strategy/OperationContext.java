package com.hcs.strategy;

public class OperationContext {

	public int accum (int a, int b, Strategy strategy){
		return strategy.doOperation(a, b);
	}

}
