// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.controls.ControlMap;
import frc.robot.subsystems.Belt;
import frc.robot.subsystems.Flywheel;

public class DefaultFly extends CommandBase {
  /** Creates a new DefaultFly. */

  public Flywheel m_Flywheel;
  public Belt m_belt;

  public DefaultFly(Flywheel flywheel, Belt belt) {
    m_Flywheel = flywheel;
    m_belt = belt;
    addRequirements(m_Flywheel);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    System.out.println("busvoltage: " + m_Flywheel.getFlyWheelSPark().getBusVoltage());
    System.out.println("motooutputvoltage: " + m_Flywheel.getFlyWheelSPark().getMotorOutputVoltage());
    if(ControlMap.gunner_button_A.get()){
      System.out.println("outtake");
      m_Flywheel.getFlyWheelSPark().set(-1);
    /* if(m_Flywheel.getFlyWheelSPark().getMotorOutputVoltage() < -11){
       m_belt.getBelt().set(-.25);
     } else{
      m_belt.getBelt().set(0);        
     }*/
  
    }
    else{
      m_Flywheel.getFlyWheelSPark().set(0);

    }
    //set deadzone


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
