// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  // Declare all objects : P

  private final CANSparkMax rightFront;
  private final CANSparkMax leftFront;
  private final CANSparkMax rightBack;
  private final CANSparkMax leftBack;
  
  /** Creates a new DriveTrain. */
  public DriveTrain() {
    rightFront = new CANSparkMax(1,MotorType.kBrushless);
    leftFront = new CANSparkMax(2,MotorType.kBrushless);
    rightBack = new CANSparkMax(3,MotorType.kBrushless);
    leftBack = new CANSparkMax(4,MotorType.kBrushless);

    leftFront.setInverted(true);
    leftBack.setInverted(true);

    rightFront.setIdleMode(IdleMode.kCoast);
    leftFront.setIdleMode(IdleMode.kCoast);
    rightBack.setIdleMode(IdleMode.kCoast);
    leftBack.setIdleMode(IdleMode.kCoast);

    rightFront.setSmartCurrentLimit(80);
    leftFront.setSmartCurrentLimit(80);
    rightBack.setSmartCurrentLimit(80);
    leftBack.setSmartCurrentLimit(80);
  }

  public void TankDrive(double rfOut, double rbOut, double lfOUt, double lbOut){
    rightFront.set(rfOut*2);
    rightBack.set(rbOut*2);
    leftFront.set(lfOUt*2);
    leftBack.set(lbOut*2);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
