package kata.rover.command;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import kata.rover.Rover;
import kata.rover.command.RightCommand;
import kata.rover.state.NorthState;
import kata.rover.state.EastState;

public class RightCommandTest {

    @Test
    public void testExecute() {
        Rover rover = new Rover.RoverBuilder()
                .x(1)
                .y(2)
                .state(new NorthState())
                .build();
        RightCommand command = new RightCommand();
        command.execute(rover);
        assertTrue(rover.getState() instanceof NorthState);
    }
}
