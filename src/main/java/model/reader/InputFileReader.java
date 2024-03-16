package model.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class InputFileReader {
    private List<String> lines;

    public InputFileReader(String filePath) throws IOException {
        lines = Files.readAllLines(Path.of(filePath));
    }

    public List<String> getLines() {
        return lines;
    }
}
