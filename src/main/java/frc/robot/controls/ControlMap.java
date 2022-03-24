// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.controls;
//control imports
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
//constants imports
import frc.robot.Constants;

/** Add your docs here. */
public class ControlMap {
    // Controllers
   public static XboxController driver              = new XboxController(Constants.DRIVER_PORT);
   public static XboxController gunner              = new XboxController(Constants.GUNNER_PORT);
   public static Joystick driveTestJoystick           = new Joystick(Constants.DRIVER_JOYSTICK_PORT);
   // Driver buttons
   public static JoystickButton driver_button_A    	= new JoystickButton(driver,1);
   public static JoystickButton driver_button_B 	= new JoystickButton(driver,2);
   public static JoystickButton driver_button_X    	= new JoystickButton(driver,3);
   public static JoystickButton driver_button_Y    	= new JoystickButton(driver,4);
   public static JoystickButton driver_button_LB   	= new JoystickButton(driver,5);
   public static JoystickButton driver_button_RB   	= new JoystickButton(driver,6);
   public static JoystickButton driver_button_BCK  	= new JoystickButton(driver,7);
   public static JoystickButton driver_button_STRT 	= new JoystickButton(driver,8);
   public static JoystickButton driver_button_LJ   	= new JoystickButton(driver,9);
   public static JoystickButton driver_button_RJ   	= new JoystickButton(driver,10);
 
   // Gunner buttons
   public static JoystickButton gunner_button_A    	= new JoystickButton(gunner,1);
   public static JoystickButton gunner_button_B    	= new JoystickButton(gunner,2);
   public static JoystickButton gunner_button_X    	= new JoystickButton(gunner,3);
   public static JoystickButton gunner_button_Y    	= new JoystickButton(gunner,4);
   public static JoystickButton gunner_button_LB   	= new JoystickButton(gunner,5);
   public static JoystickButton gunner_button_RB   	= new JoystickButton(gunner,6);
   public static JoystickButton gunner_button_BCK  	= new JoystickButton(gunner,7);
   public static JoystickButton gunner_button_STRT 	= new JoystickButton(gunner,8);
   public static JoystickButton gunner_button_LJ   	= new JoystickButton(gunner,9);
   public static JoystickButton gunner_button_RJ   	= new JoystickButton(gunner,10);
}
