package kata.rover.command;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import kata.rover.Rover;
import kata.rover.command.MoveCommand;
import kata.rover.state.NorthState;

public class MoveCommandTest {

    @Test
    public void testExecute() {
        Rover rover = new Rover.RoverBuilder()
                .x(1)
                .y(2)
                .state(new NorthState())
                .build();
        MoveCommand command = new MoveCommand();
        command.execute(rover);
        assertEquals(1, rover.getX());
        assertEquals(2, rover.getY());
    }
}
