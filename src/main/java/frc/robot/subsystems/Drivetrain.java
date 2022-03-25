// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  
  private final WPI_TalonSRX spark_fl;
  private final WPI_TalonSRX spark_bl; 
  private final WPI_TalonSRX spark_fr;  
  private final WPI_TalonSRX spark_br; 
  public static Servo leftServo;
  public static Servo rightServo;

  public Drivetrain() {
    spark_fl = new WPI_TalonSRX(Constants.SPARK_FL);
    spark_bl = new WPI_TalonSRX(Constants.SPARK_BL);
    spark_fr = new WPI_TalonSRX(Constants.SPARK_FR);
    spark_br = new WPI_TalonSRX(Constants.SPARK_BR);

    leftServo = new Servo(Constants.LEFT_SERVO_PORT);
    rightServo = new Servo(Constants.RIGHT_SERVO_PORT);
  }

  public final WPI_TalonSRX getTalonLeft(int num) {
    if(num == 0) {
      return spark_fl;
    } 
    else { 
     return spark_bl;
    }
  }

  public final WPI_TalonSRX getTalonRight(int num){
    if(num == 0){
      return spark_fr;

    } 
    else {
     return spark_br;
    }
  }
  /** Creates a new Drivetrain. */

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
