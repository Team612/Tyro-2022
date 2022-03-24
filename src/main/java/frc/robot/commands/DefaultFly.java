// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.controls.ControlMap;
import frc.robot.subsystems.Flywheel;

public class DefaultFly extends CommandBase {
  /** Creates a new DefaultFly. */

  public Flywheel m_Flywheel;

  public DefaultFly(Flywheel flywheel) {
    m_Flywheel = flywheel;
    addRequirements(m_Flywheel);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    double leftJoyStickValue = ControlMap.driver.getLeftY();
    System.out.println(leftJoyStickValue);
    //set deadzone
    if (leftJoyStickValue < 0.2) {
      m_Flywheel.getFlyWheelSPark().set(leftJoyStickValue*-1);
    }
    else {
      m_Flywheel.getFlyWheelSPark().set(0);
    }

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
