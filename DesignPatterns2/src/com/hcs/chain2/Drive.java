package com.hcs.chain2;

public class Drive {

	public static void main(String[] args) {
		Detector d5 = new D5(null);
		Detector d10 = new D10(d5);
		Detector d20 = new D20(d10);
		Detector d50 = new D50(d20);
		Detector d100 = new D100(d50);
		Detector d200 = new D200(d100);
		
		d200.check(1855);
		d200.printCount();

	}

}
