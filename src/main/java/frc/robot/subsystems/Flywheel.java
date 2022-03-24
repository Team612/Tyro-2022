// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Flywheel extends SubsystemBase {
  
  final CANSparkMax spark_fly; 
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  /** Creates a new Flywheel. */
  public Flywheel() {
    spark_fly = new CANSparkMax(Constants.FLYWHEEL_MOTOR, MotorType.kBrushless);
  }

  public final CANSparkMax getFlyWheelSPark() {
    return spark_fly;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
