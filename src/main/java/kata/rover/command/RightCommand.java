package kata.rover.command;

import kata.rover.Rover;

// command class for turning the rover right
public class RightCommand implements Command {
    @Override
    public void execute(Rover rover) {
        Rover.RoverBuilder builder = new Rover.RoverBuilder();
        builder.x(rover.getX()).y(rover.getY()).state(rover.getState().turnRight());
        rover = builder.build();
    }
}
