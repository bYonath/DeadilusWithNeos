// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  private final CANSparkMax RightShooterMotor;
  private final CANSparkMax LeftShooterMotor;

  /** Creates a new Shooter. */
  // Again, this is just a constructor
  // So shush
  public Shooter() {
    RightShooterMotor = new CANSparkMax(5, MotorType.kBrushless);
    LeftShooterMotor = new CANSparkMax(6,MotorType.kBrushless);

    RightShooterMotor.setSmartCurrentLimit(0);
    LeftShooterMotor.setSmartCurrentLimit(0);

    RightShooterMotor.setIdleMode(null);
    LeftShooterMotor.setIdleMode(null);

    
  }

  public void RunShooter(double rightOut, double leftOut){

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
