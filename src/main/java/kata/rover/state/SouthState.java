package kata.rover.state;

import kata.rover.Rover;

// state class for south direction
public class SouthState implements RoverState {
    @Override
    public Direction getDirection() {
        return Direction.S;
    }

    @Override
    public RoverState turnLeft() {
        return new EastState();
    }

    @Override
    public RoverState turnRight() {
        return new WestState();
    }

    @Override
    public void move(Rover rover) {
        Rover.RoverBuilder builder = new Rover.RoverBuilder();
        builder.y(rover.getY() - 1);
        builder.x(rover.getX());
        builder.state(this);
        rover = builder.build();
    }
}
