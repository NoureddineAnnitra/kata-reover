package kata.rover.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import kata.rover.state.EastState;
import kata.rover.state.RoverState;
import kata.rover.Rover;

public class EastStateTest {

    private RoverState eastState = new EastState();

    @Test
    public void testTurnLeft() {
        RoverState newState = eastState.turnLeft();
        assertEquals(Direction.N, newState.getDirection());
    }

    @Test
    public void testTurnRight() {
        RoverState newState = eastState.turnRight();
        assertEquals(Direction.S, newState.getDirection());
    }

    @Test
    public void testMove() {
        Rover rover = new Rover.RoverBuilder()
                .x(1)
                .y(0)
                .state(eastState)
                .build();
        eastState.move(rover);
        assertEquals(1, rover.getX());
    }
}
