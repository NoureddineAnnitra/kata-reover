package kata.rover.state;

import kata.rover.Rover;

// state class for north direction
public class NorthState implements RoverState {
    @Override
    public Direction getDirection() {
        return Direction.N;
    }

    @Override
    public RoverState turnLeft() {
        return new WestState();
    }

    @Override
    public RoverState turnRight() {
        return new EastState();
    }

    public void move(Rover rover) {
        Rover.RoverBuilder builder = new Rover.RoverBuilder();
        builder.y(rover.getY() + 1);
        builder.x(rover.getX());
        builder.state(this);
        rover = builder.build();
    }
}
