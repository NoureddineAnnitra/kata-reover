package kata.rover;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import kata.rover.InputReader;

public class InputReaderTest {

    @Test
    public void testReadInput() throws IOException {
        File file = new File("input.txt");
        String[] expected = {"5 5", "1 2 N", "LMLMLMLMM", "3 3 E", "MMRMMRMRRM"};
        String input = String.join("\n", expected);
        Files.write(Paths.get(file.getPath()), input.getBytes());

        InputReader inputReader = new InputReader(file.getPath());
        String[] actual = inputReader.readInput();

        assertArrayEquals(expected, actual);
    }
}
