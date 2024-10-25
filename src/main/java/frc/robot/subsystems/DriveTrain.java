// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// import robot constants
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {

  // Declare all objects : P
  private final CANSparkMax rightFront;
  private final CANSparkMax leftFront;
  private final CANSparkMax rightBack;
  private final CANSparkMax leftBack;
  
  /** Creates a new DriveTrain. */
  public DriveTrain() {
    rightFront = new CANSparkMax(Constants.DriveConstants.RightFrontPort,MotorType.kBrushless);
    rightBack = new CANSparkMax(Constants.DriveConstants.RightBackPort,MotorType.kBrushless);
    leftFront = new CANSparkMax(Constants.DriveConstants.LeftFrontMotor,MotorType.kBrushless);
    leftBack = new CANSparkMax(Constants.DriveConstants.LeftBackMotor,MotorType.kBrushless);

    // YOOO I FOUND IT!!! TANK DRIVE CAN BE SIMPLIFIED W NEOS!!! WOOOOOWOOWOFOSFOSAD
    //rightBack.follow(rightFront);
    //leftBack.follow(leftFront);

    leftFront.setInverted(true);
    leftBack.setInverted(true);

    rightFront.setIdleMode(IdleMode.kBrake);
    leftFront.setIdleMode(IdleMode.kBrake);
    rightBack.setIdleMode(IdleMode.kBrake);
    leftBack.setIdleMode(IdleMode.kBrake);

    rightFront.setSmartCurrentLimit(Constants.DriveConstants.CurrentMax);
    leftFront.setSmartCurrentLimit(Constants.DriveConstants.CurrentMax);
    rightBack.setSmartCurrentLimit(Constants.DriveConstants.CurrentMax);
    leftBack.setSmartCurrentLimit(Constants.DriveConstants.CurrentMax);
  }

  public void TankDrive(double rfOut, double rbOut, double lfOUt, double lbOut){
    rightFront.set(rfOut*Constants.DriveConstants.DriveMotorMultiplier);
    rightBack.set(rbOut*Constants.DriveConstants.DriveMotorMultiplier);
    leftFront.set(lfOUt*Constants.DriveConstants.DriveMotorMultiplier);
    leftBack.set(lbOut*Constants.DriveConstants.DriveMotorMultiplier);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
