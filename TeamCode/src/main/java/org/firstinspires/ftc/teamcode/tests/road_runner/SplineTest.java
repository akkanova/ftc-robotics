package org.firstinspires.ftc.teamcode.tests.road_runner;

import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.acmerobotics.roadrunner.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.tests.TestTools;

/**
 * <a href="https://github.com/acmerobotics/road-runner-quickstart/blob/master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/tuning/SplineTest.java">
 *      Copied from Road Runner quickstart  -  SplineTest.java
 * </a>. Modified for mecanum drive base testing only.
 */
public class SplineTest extends LinearOpMode {
    @Override
    public void runOpMode() {
        TestTools testTools = new TestTools(hardwareMap, telemetry);
        waitForStart();

        Actions.runBlocking(
            testTools.drive.getNewActionBuilder(new Pose2d(0, 0, 0))
                .splineTo(new Vector2d(30, 30), Math.PI / 2)
                .splineTo(new Vector2d(0, 60), Math.PI)
                .build()
        );
    }
}
