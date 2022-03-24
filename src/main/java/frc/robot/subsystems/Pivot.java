// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Pivot extends SubsystemBase {

private CANSparkMax spark_pivot;

  /** Creates a new Pivot. */
  public Pivot() {
    spark_pivot = new CANSparkMax(Constants.PIVOT_MOTOR, MotorType.kBrushless);
  }

  public CANSparkMax getPivot() {
    return spark_pivot;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
