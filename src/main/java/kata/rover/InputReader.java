package kata.rover;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputReader {
    private File inputFile;

    public InputReader(String inputFilePath) {
        this.inputFile = new File(inputFilePath);
    }

    public String[] readInput() {
        try (Scanner scanner = new Scanner(inputFile)) {
            StringBuilder input = new StringBuilder();
            while (scanner.hasNextLine()) {
                input.append(scanner.nextLine()).append("\n");
            }
            return input.toString().split("\n");
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Input file not found: " + inputFile.getAbsolutePath());
        }
    }
}
