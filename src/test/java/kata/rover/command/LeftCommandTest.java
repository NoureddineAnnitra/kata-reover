package kata.rover.command;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import kata.rover.Rover;
import kata.rover.command.LeftCommand;
import kata.rover.state.NorthState;
import kata.rover.state.WestState;

public class LeftCommandTest {

    @Test
    public void testExecute() {
        Rover rover = new Rover.RoverBuilder()
                .x(1)
                .y(2)
                .state(new WestState())
                .build();
        LeftCommand command = new LeftCommand();
        command.execute(rover);
        assertTrue(rover.getState() instanceof WestState);
    }
}
