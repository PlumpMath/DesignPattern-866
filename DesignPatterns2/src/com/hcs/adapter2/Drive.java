package com.hcs.adapter2;

public class Drive {

	public static void main(String[] args) {
		Attacker tank = new Tank();
		tank.driveForward();
		tank.fire();
		tank.driveBackward();
		
		Attacker robot = new RobotAdapter(new Robot());
		robot.driveForward();
		robot.fire();
		robot.driveBackward();
		
		
		
		
		

	}

}
