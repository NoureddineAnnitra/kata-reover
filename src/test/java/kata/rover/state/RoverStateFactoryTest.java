package kata.rover.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import kata.rover.state.RoverState;
import kata.rover.state.RoverStateFactory;
import kata.rover.state.Direction;

public class RoverStateFactoryTest {

    @Test
    public void testGetStateN() {
        RoverState state = RoverStateFactory.getState(Direction.N);
        assertTrue(state instanceof NorthState);
    }

    @Test
    public void testGetStateS() {
        RoverState state = RoverStateFactory.getState(Direction.S);
        assertTrue(state instanceof SouthState);
    }

    @Test
    public void testGetStateE() {
        RoverState state = RoverStateFactory.getState(Direction.E);
        assertTrue(state instanceof EastState);
    }

    @Test
    public void testGetStateW() {
        RoverState state = RoverStateFactory.getState(Direction.W);
        assertTrue(state instanceof WestState);
    }
}
