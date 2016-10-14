package com.hcs.strategy;

public class OperationContext {

	private Strategy strategy;
	
	public OperationContext(Strategy strategy){
		this.strategy = strategy;
	}
	
	public int accum2(int a, int b){
		return this.strategy.doOperation(a, b);
	}
	
//	public int accum (int a, int b, Strategy strategy){
//		return this.strategy.doOperation(a, b);
//	}

}
