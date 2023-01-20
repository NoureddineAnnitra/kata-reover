package kata.rover.state;

import kata.rover.Rover;

// state class for east direction
public class EastState implements RoverState {
    @Override
    public Direction getDirection() {
        return Direction.E;
    }

    @Override
    public RoverState turnLeft() {
        return new NorthState();
    }

    @Override
    public RoverState turnRight() {
        return new SouthState();
    }

    public void move(Rover rover) {
        Rover.RoverBuilder builder = new Rover.RoverBuilder();
        builder.y(rover.getY());
        builder.x(rover.getX() + 1);
        builder.state(this);
        rover = builder.build();
    }
}
