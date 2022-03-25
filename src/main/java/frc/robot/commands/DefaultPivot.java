// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.controls.ControlMap;
import frc.robot.subsystems.LimitSwitches;
import frc.robot.subsystems.Pivot;

public class DefaultPivot extends CommandBase {
  /** Creates a new DefaultPivot. */

  Pivot m_pivot;

  public DefaultPivot(Pivot pivot) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_pivot = pivot;
    addRequirements(m_pivot);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    double rightJoystickValue = ControlMap.gunner.getLeftY();
    
    m_pivot.set(rightJoystickValue * .5);

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
