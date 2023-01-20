package kata.rover.command;

import kata.rover.Rover;

// command class for turning the rover left
public class LeftCommand implements Command {
    @Override
    public void execute(Rover rover) {
        Rover.RoverBuilder builder = new Rover.RoverBuilder();
        builder.x(rover.getX()).y(rover.getY()).state(rover.getState().turnLeft());
        rover = builder.build();
    }
}
