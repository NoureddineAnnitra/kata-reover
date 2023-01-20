package kata.rover.state;

import kata.rover.Rover;

// state class for west direction
public class WestState implements RoverState {
    @Override
    public Direction getDirection() {
        return Direction.W;
    }

    @Override
    public RoverState turnLeft() {
        return new SouthState();
    }

    @Override
    public RoverState turnRight() {
        return new NorthState();
    }

    @Override
    public void move(Rover rover) {
        Rover.RoverBuilder builder = new Rover.RoverBuilder();
        builder.y(rover.getY());
        builder.x(rover.getX() - 1);
        builder.state(this);
        rover = builder.build();
    }


}
