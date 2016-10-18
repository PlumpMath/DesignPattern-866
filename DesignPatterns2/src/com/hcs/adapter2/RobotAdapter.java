package com.hcs.adapter2;

public class RobotAdapter implements Attacker{

	private RobotAttacker robot;
	
	public RobotAdapter(Robot robot){
		this.robot = new Robot();
	}
	
	@Override
	public void driveForward() {
		robot.stepForward();
	}

	@Override
	public void fire() {
		robot.smash();
	}

	@Override
	public void driveBackward() {
		robot.stepBackward();
	}

}
