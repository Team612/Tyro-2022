// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.DefaultBelt;
import frc.robot.commands.DefaultDrive;
import frc.robot.commands.DefaultFly;
import frc.robot.commands.DefaultPivot;
import frc.robot.commands.ExampleCommand;
import frc.robot.controls.ControlMap;
import frc.robot.subsystems.Belt;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Flywheel;
import frc.robot.subsystems.LimitSwitches;
import frc.robot.subsystems.Pivot;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {


  // subsystem declarations
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final Belt m_belt = new Belt();
  private final Drivetrain m_drivetrain = new Drivetrain();
  private final Flywheel m_flywheel = new Flywheel();
  private final LimitSwitches m_limitSwitches = new LimitSwitches();
  private final Pivot m_pivot = new Pivot();

  //command declarations
  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  private final DefaultDrive m_DefaultDrive = new DefaultDrive(m_drivetrain);
  private final DefaultPivot m_DefaultPivot = new DefaultPivot(m_pivot, m_limitSwitches);
  private final DefaultFly m_DefaultFly = new DefaultFly(m_flywheel);
  private final DefaultBelt m_DefaultBelt = new DefaultBelt(m_belt);
  
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}
    ControlMap.gunner_button_A.whileHeld(new DefaultPivot(m_pivot, m_limitSwitches));
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
