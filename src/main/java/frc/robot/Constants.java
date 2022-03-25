// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static int FLYWHEEL_MOTOR = 1;
    public static int BELT_MOTOR = 3;
    public static int PIVOT_MOTOR = 2; 

    public static int DRIVER_PORT = 1;
    public static int GUNNER_PORT = 0;  
    public static int DRIVER_JOYSTICK_PORT = 4;
    public static int LEFT_SERVO_PORT = 0;
    public static int RIGHT_SERVO_PORT = 1;

    //drivetrain
    public static int SPARK_FL = 6;
    public static int SPARK_BL = 7;
    public static int SPARK_FR = 4;
    public static int SPARK_BR = 5;

    //limit switch ports
    public static int LIMIT_SWITCH_ZERO = 0;
    public static int LIMIT_SWITCH_ONE = 1;

    //servo values for DefaultDrive. not sure what their purpose is
    public static int LEFT_SERVO_VALUE = 72;
    public static int RIGHT_SERVO_VALUE = 114;

}
