package com.hcs.chain2;

public class Detector {
	
	private Detector next;
	private int value;
	private int count;
	
	public Detector (Detector next, int value){
		this.next = next;
		this.value = value;
	}
	
	public void check(int sum){
		count = sum/value;
		
		if (next != null){
			next.check(sum%value);			
		}
	}
	
	public void printCount(){
		System.out.println(value + ": " + count);
		if (next != null){
			next.printCount();
		}
	}
}
