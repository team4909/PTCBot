package org.usfirst.frc4909.PTCAgileBot.commands;

import org.usfirst.frc4909.PTCAgileBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SlowDrive extends Command {

    public SlowDrive() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drivetrain);

        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.tankDriveSlow();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
