package com.tw.marsrover.direction;

import com.tw.marsrover.Plateau;
import com.tw.marsrover.Rover;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class NorthDirectionTest {

    private Plateau plateau;
    private int xCoordinate;
    private int yCoordinate;
    private NorthDirection northDirection;
    private Rover rover;

    @Before
    public void setUp() {
        plateau = new Plateau(5, 5);
        xCoordinate = 2;
        yCoordinate = 2;
        northDirection = new NorthDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, northDirection);
    }

    @Test
    public void whenNorthDirectionTurnsRightNewDirectionIsEast() {
        assertEquals(EastDirection.class, northDirection.spinRight().getClass());
    }

    @Test
    public void whenNorthDirectionTurnsLeftNewDirectionIsWest() {
        assertEquals(WestDirection.class, northDirection.spinLeft().getClass());
    }

    @Test
    public void whenNorthDirectionMovesForwardCoordinateYIncrements() {
        northDirection.moveForward(rover);
        assertEquals(++yCoordinate, rover.getCoordinateY());
    }
}
