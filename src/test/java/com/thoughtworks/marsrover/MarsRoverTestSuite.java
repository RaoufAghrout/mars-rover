package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.command.MoveForwardCommandTest;
import com.thoughtworks.marsrover.command.SpinLeftCommandTest;
import com.thoughtworks.marsrover.command.SpinRightCommandTest;
import com.thoughtworks.marsrover.direction.EastDirectionTest;
import com.thoughtworks.marsrover.direction.NorthDirectionTest;
import com.thoughtworks.marsrover.direction.SouthDirectionTest;
import com.thoughtworks.marsrover.direction.WestDirectionTest;
import com.thoughtworks.marsrover.util.InputUtilTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MoveForwardCommandTest.class,
        SpinLeftCommandTest.class,
        SpinRightCommandTest.class,
        EastDirectionTest.class,
        NorthDirectionTest.class,
        SouthDirectionTest.class,
        WestDirectionTest.class,
        InputUtilTest.class,
        PlateauTest.class,
        RoverTest.class
})
public class MarsRoverTestSuite extends BaseTest {

}
