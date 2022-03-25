// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class LimitSwitches extends SubsystemBase {
  
  public final DigitalInput limit_switch_zero;
  public final DigitalInput limit_switch_one;
  
  /** Creates a new LimitSwitches. */
  
  public LimitSwitches() {

    limit_switch_zero = new DigitalInput(Constants.LIMIT_SWITCH_ZERO);
    limit_switch_one = new DigitalInput(Constants.LIMIT_SWITCH_ONE);
  } 

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
