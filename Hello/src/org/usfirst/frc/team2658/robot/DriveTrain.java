package org.usfirst.frc.team2658.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain extends  Thread{
	public void run() {
		driveTankDrive(ryan.ryansDriveTrain, 1,1.5, ryan.ryan.getY(Hand.kLeft), ryan.ryan.getY(Hand.kRight));
	}
	Robot ryan;
	
	
	public DriveTrain(Robot ryan) {
		this.ryan= ryan;
	}
	public void driveTankDrive(DifferentialDrive driveTrain, double power, double curve, double leftAxis, double rightAxis) {
		int constR=1,  constL=1;
		if(rightAxis<0) {
			constR=1;
		}
		else if(rightAxis>0) {
			constR=-1;
		}
		if(leftAxis<0) {
			constL=1;
		}
		else if(leftAxis>0) {
			constL=-1;
		}
		driveTrain.tankDrive(constL*power*Math.pow(Math.abs(leftAxis), curve), constR*power*Math.pow(Math.abs(rightAxis), curve));
	}

}
