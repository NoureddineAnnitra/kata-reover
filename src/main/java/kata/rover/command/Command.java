package kata.rover.command;

import kata.rover.Rover;

// interface for command pattern
public interface Command {
    void execute(Rover rover);
}
