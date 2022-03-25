// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Flywheel extends SubsystemBase {
  
  final WPI_TalonSRX spark_fly; 
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  /** Creates a new Flywheel. */
  public Flywheel() {
    spark_fly = new WPI_TalonSRX(Constants.FLYWHEEL_MOTOR);
  }

  public final WPI_TalonSRX getFlyWheelSPark() {
    return spark_fly;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
