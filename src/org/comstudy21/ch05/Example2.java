package org.comstudy21.ch05;

class Power {
	int kick = 10;
	int punch = 20;
	
	public void thisKickPunch(int kick, int punch) {
		this.kick = 10; this.punch = 20;
	}
}

public class Example2 {
	public void main(String[] args) {
		Power robot = new Power();
		System.out.println(robot.thisKickPunch(0, 0);","+robot.punch);
		
	}
}
