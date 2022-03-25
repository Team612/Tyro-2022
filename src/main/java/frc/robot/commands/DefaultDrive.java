// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.controls.ControlMap;
import frc.robot.subsystems.Drivetrain;

public class DefaultDrive extends CommandBase {

  int left_servo_value;
  int right_servo_value;
  public Drivetrain m_drivetrain;

  /** Creates a new DefaultDrive. */
  public DefaultDrive(Drivetrain drivetrain) {
    // Use addRequirements() here to declare subsystem dependencies.
    left_servo_value = Constants.LEFT_SERVO_VALUE;
    right_servo_value = Constants.RIGHT_SERVO_VALUE;
    m_drivetrain = drivetrain;
    addRequirements(m_drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    Drivetrain.leftServo.setAngle(left_servo_value);
    Drivetrain.rightServo.setAngle(right_servo_value);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {



  }



  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
