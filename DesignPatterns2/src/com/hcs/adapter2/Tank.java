package com.hcs.adapter2;

public class Tank implements Attacker {

	@Override
	public void driveForward() {
		System.out.println("Move forward");

	}

	@Override
	public void fire() {
		System.out.println("Fire");

	}

	@Override
	public void driveBackward() {
		System.out.println("Move backward");

	}

}
