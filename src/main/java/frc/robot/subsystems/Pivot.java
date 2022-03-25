// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Pivot extends SubsystemBase {

private WPI_TalonSRX spark_pivot;

  /** Creates a new Pivot. */
  public Pivot() {
    spark_pivot = new WPI_TalonSRX(Constants.PIVOT_MOTOR);
  }

  public WPI_TalonSRX getPivot() {
    return spark_pivot;
  }

  public void set(double speed){
    spark_pivot.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
