package kata.rover.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import kata.rover.Rover;
import kata.rover.state.SouthState;
import kata.rover.state.RoverState;
import kata.rover.state.Direction;

public class SouthStateTest {

    private RoverState southState = new SouthState();

    @Test
    public void testTurnLeft() {
        RoverState newState = southState.turnLeft();
        assertEquals(Direction.E, newState.getDirection());
    }

    @Test
    public void testTurnRight() {
        RoverState newState = southState.turnRight();
        assertEquals(Direction.W, newState.getDirection());
    }

    @Test
    public void testMove() {
        Rover rover = new Rover.RoverBuilder()
                .x(2)
                .y(2)
                .state(southState)
                .build();
        southState.move(rover);
        assertEquals(2, rover.getX());
        assertEquals(2, rover.getY());
    }
}
