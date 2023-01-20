package kata.rover.state;

import kata.rover.Rover;

// interface for state pattern
public interface RoverState {
    Direction getDirection();
    RoverState turnLeft();
    RoverState turnRight();
    void move(Rover rover);
}
