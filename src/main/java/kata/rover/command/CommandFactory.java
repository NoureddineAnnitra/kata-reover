package kata.rover.command;

// factory class to create command objects
public class CommandFactory {
    public static Command getCommand(char commandChar) {
        // return the corresponding command object based on the input character
        switch (commandChar) {
            case 'L':
                return new LeftCommand();
            case 'R':
                return new RightCommand();
            case 'M':
                return new MoveCommand();
            default:
                throw new IllegalArgumentException("Invalid command: " + commandChar);
        }
    }
}
