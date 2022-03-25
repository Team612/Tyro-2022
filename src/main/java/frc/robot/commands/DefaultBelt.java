// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Belt;
import frc.robot.controls.ControlMap;

public class DefaultBelt extends CommandBase {

  //import belt subsystem
  public Belt m_belt;

  /** Creates a new DefaultBelt. */
  public DefaultBelt(Belt belt) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_belt = belt;
    addRequirements(m_belt);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    //turn when the right joystick button starts:

    if (ControlMap.gunner_button_RB.get()) {
      System.out.println("yay we work");
      m_belt.getBelt().set(-0.25);
    }
    
    else {
      m_belt.getBelt().set(0);
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
