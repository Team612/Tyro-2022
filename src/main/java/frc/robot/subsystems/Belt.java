// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Belt extends SubsystemBase {

  private final CANSparkMax spark_belt;

  /** Creates a new Belt. */
  public Belt() {
    spark_belt = new CANSparkMax(Constants.BELT_MOTOR, MotorType.kBrushless);
  }
  
  public CANSparkMax getBelt() {
    return spark_belt; 
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
