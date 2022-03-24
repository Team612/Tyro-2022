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
  LimitSwitches m_LimitSwitches;

  public DefaultPivot(Pivot pivot, LimitSwitches LimitSwitches) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_pivot = pivot;
    m_LimitSwitches = LimitSwitches;
    addRequirements(m_pivot, m_LimitSwitches);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    double rightJoystickValue = ControlMap.gunner.getRightY();
    
    if(Math.abs(rightJoystickValue) < .1){
      m_pivot.getPivot().set(0);
    } 
    else {
      m_pivot.getPivot().set(rightJoystickValue);
    }
    
    if(m_LimitSwitches.limit_switch_zero.get() && rightJoystickValue < -0.1){
      m_pivot.getPivot().set(0);
    }
    if(m_LimitSwitches.limit_switch_one.get() && rightJoystickValue > 0.1) {
      m_pivot.getPivot().set(0);
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
