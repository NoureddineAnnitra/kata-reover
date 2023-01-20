package kata.rover.state;

// factory class to create state objects
public class RoverStateFactory {
    public static RoverState getState(Direction direction) {
        // return the corresponding state object based on the input direction
        switch (direction) {
            case N:
                return new NorthState();
            case E:
                return new EastState();
            case S:
                return new SouthState();
            case W:
                return new WestState();
            default:
                throw new IllegalArgumentException("Invalid direction: " + direction);
        }
    }
}
