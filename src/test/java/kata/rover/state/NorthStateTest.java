package kata.rover.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import kata.rover.Rover;
import kata.rover.state.NorthState;
import kata.rover.state.RoverState;

public class NorthStateTest {

    private RoverState northState = new NorthState();

    @Test
    public void testTurnLeft() {
        RoverState newState = northState.turnLeft();
        assertEquals(Direction.W, newState.getDirection());
    }

    @Test
    public void testTurnRight() {
        RoverState newState = northState.turnRight();
        assertEquals(Direction.E, newState.getDirection());
    }

    @Test
    public void testMove() {
        Rover rover = new Rover.RoverBuilder()
                .x(0)
                .y(1)
                .state(northState)
                .build();
        northState.move(rover);
        assertEquals(0, rover.getX());
        assertEquals(1, rover.getY());
    }
}
