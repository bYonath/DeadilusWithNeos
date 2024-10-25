// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandPS4Controller;
import frc.robot.Robot;
import frc.robot.subsystems.*;
import frc.robot.Constants;

public class Drive extends Command {
  private final CommandPS4Controller ps4Controller;
  private final DriveTrain DriveTrain;
  private double xAxis;
  private double yAxis;
  /** Creates a new Drive. */
  public Drive(DriveTrain DriveTrain, CommandPS4Controller ps4Controller) {
    this.ps4Controller = ps4Controller;
    this.DriveTrain = DriveTrain;
    xAxis = 0;
    yAxis = 0;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.m_Drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    yAxis = MathUtil.applyDeadband(ps4Controller.getLeftY(),Constants.DriveConstants.Deadband);
    xAxis = MathUtil.applyDeadband(ps4Controller.getRightX(),Constants.DriveConstants.Deadband);
    DriveTrain.TankDrive((yAxis-xAxis), (yAxis-xAxis), (yAxis-xAxis), (yAxis-xAxis));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
