package kata.rover.command;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import kata.rover.command.Command;
import kata.rover.command.CommandFactory;
import kata.rover.command.MoveCommand;
import kata.rover.command.RightCommand;
import kata.rover.command.LeftCommand;

public class CommandFactoryTest {

    @Test
    public void testGetCommandM() {
        Command command = CommandFactory.getCommand('M');
        assertTrue(command instanceof MoveCommand);
    }

    @Test
    public void testGetCommandL() {
        Command command = CommandFactory.getCommand('L');
        assertTrue(command instanceof LeftCommand);
    }

    @Test
    public void testGetCommandR() {
        Command command = CommandFactory.getCommand('R');
        assertTrue(command instanceof RightCommand);
    }

}
