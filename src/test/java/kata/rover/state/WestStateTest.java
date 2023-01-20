package kata.rover.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import kata.rover.Rover;
import kata.rover.state.WestState;
import kata.rover.state.RoverState;
import kata.rover.state.Direction;

public class WestStateTest {

    private RoverState westState = new WestState();

    @Test
    public void testTurnLeft() {
        RoverState newState = westState.turnLeft();
        assertEquals(Direction.S, newState.getDirection());
    }

    @Test
    public void testTurnRight() {
        RoverState newState = westState.turnRight();
        assertEquals(Direction.N, newState.getDirection());
    }

    @Test
    public void testMove() {
        Rover rover = new Rover.RoverBuilder()
                .x(1)
                .y(1)
                .state(westState)
                .build();
        westState.move(rover);
        assertEquals(1, rover.getX());
        assertEquals(1, rover.getY());
    }
}
