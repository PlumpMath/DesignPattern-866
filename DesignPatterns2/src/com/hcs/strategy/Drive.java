package com.hcs.strategy;

public class Drive {

	public static void main(String... args){
		OperationContext context = new OperationContext();
		System.out.println("Start...");
		System.out.println("add" + context.accum(1, 3, new AddOperation()));
		System.out.println("add" + context.accum(1, 3, new DivOperation()));
	}
}
