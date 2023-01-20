package kata.rover;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

import kata.rover.OutputWriter;

public class OutputWriterTest {

    @Test
    public void testWriteOutput() throws IOException {
        File file = new File("output.txt");
        String[] expected = {"1 3 N", "5 1 E"};

        OutputWriter outputWriter = new OutputWriter(file.getPath());
        outputWriter.writeOutput(expected);

        String[] actual = Files.readAllLines(Paths.get(file.getPath())).toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }
}
