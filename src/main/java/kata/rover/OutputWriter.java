package kata.rover;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OutputWriter {
    private File outputFile;

    public OutputWriter(String outputFilePath) {
        this.outputFile = new File(outputFilePath);
    }

    public void writeOutput(String[] output) {
        try (PrintWriter writer = new PrintWriter(outputFile)) {
            for (String line : output) {
                writer.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Unable to write to output file: " + outputFile.getAbsolutePath());
        }
    }
}
