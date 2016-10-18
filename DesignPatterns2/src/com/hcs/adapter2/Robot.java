package com.hcs.adapter2;

public class Robot implements RobotAttacker{

	@Override
	public void stepForward() {
		System.out.println("Step forward");
		
	}

	@Override
	public void smash() {
		System.out.println("smash");
	}

	@Override
	public void stepBackward() {
		System.out.println("Step backward");
		
	}

}
