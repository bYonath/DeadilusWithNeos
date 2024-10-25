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
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  // Constants for the DriveTrain and its respective controller command
  public static class DriveConstants{
    // Deadband controller setting (combat the horrific stick drift)
    public static final double Deadband = 0.85;
    // Used in the DriveTrain Subsystem for easier 
    // changing of the .setSmartCurrentLimit() method
    public static final int CurrentMax = 40;
    // Multiplier for the DriveTrain Motors (change this to theoretically make the bot go faster)
    public static final double DriveMotorMultiplier = 1;
    // Motor Ports for each motor, Changer to match respective motor ports
    // Failure to do so will cause the robot to malfunction
    public static final int RightFrontPort = 1;
    public static final int RightBackPort = 3;
    public static final int LeftFrontMotor = 2;
    public static final int LeftBackMotor = 4;
  }
  // Constants for Shooter
  public static class ShooterConstants{
      public static final int placeholder1 = 0;
      public static final int placeholder2 = 0;
  }
  // Constants for auto
  public static class AutoConstants{

  }
}
