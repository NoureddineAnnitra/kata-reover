package kata.rover;

import kata.rover.command.Command;
import kata.rover.command.CommandFactory;
import kata.rover.state.Direction;
import kata.rover.state.RoverState;
import kata.rover.state.RoverStateFactory;

public class Rover {
    private int x;
    private int y;
    private RoverState state;

    // private constructor to prevent direct instantiation
    private Rover(int x, int y, RoverState state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }

    // getters and setters for x, y, and state
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public RoverState getState() {
        return state;
    }

    // method to process a string of commands and update the state of the rover
    public void processCommands(String commands) {
        CommandFactory commandFactory = new CommandFactory();
        for (char c : commands.toCharArray()) {
            Command command = commandFactory.getCommand(c);
            command.execute(this);
        }
    }

    // Builder class for Rover
    public static class RoverBuilder {
        private int x;
        private int y;
        private RoverState state;

        public RoverBuilder x(int x) {
            this.x = x;
            return this;
        }

        public RoverBuilder y(int y) {
            this.y = y;
            return this;
        }

        public RoverBuilder state(RoverState state) {
            this.state = state;
            return this;
        }

        public Rover build() {
            return new Rover(x, y, state);
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide input file path and output file path as command line arguments.");
            return;
        }
        String inputFilePath = args[0];
        String outputFilePath = args[1];

        InputReader inputReader = new InputReader(inputFilePath);
        OutputWriter outputWriter = new OutputWriter(outputFilePath);

        String[] input = inputReader.readInput();
        String[] output = new String[input.length / 2];
        int outputIndex = 0;
        for (int i = 2; i < input.length; i += 2) {
            String[] initialPosition = input[i - 2].split(" ");
            int x = Integer.parseInt(initialPosition[0]);
            int y = Integer.parseInt(initialPosition[1]);
            Direction direction = Direction.valueOf(initialPosition[2]);

            Rover rover = new RoverBuilder()
                    .x(x)
                    .y(y)
                    .state(RoverStateFactory.getState(direction))
                    .build();
            rover.processCommands(input[i - 1]);
            output[outputIndex++] = rover.getX() + " " + rover.getY() + " " + rover.getState().getDirection();
        }
        outputWriter.writeOutput(output);
    }
}

