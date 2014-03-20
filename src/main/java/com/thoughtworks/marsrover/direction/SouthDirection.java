package com.thoughtworks.marsrover.direction;

import com.thoughtworks.marsrover.Rover;

public class SouthDirection implements Direction {

    @Override
    public Direction spinRight() {
        return new WestDirection();
    }

    @Override
    public Direction spinLeft() {
        return new EastDirection();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setCoordinateY(rover.getCoordinateY() - 1);
    }
}
