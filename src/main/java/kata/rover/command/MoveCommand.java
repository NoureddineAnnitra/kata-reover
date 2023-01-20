package kata.rover.command;

import kata.rover.Rover;

// command class for moving the rover forward
public class MoveCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.getState().move(rover);
    }
}
