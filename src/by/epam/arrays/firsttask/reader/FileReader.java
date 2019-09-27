package by.epam.arrays.firsttask.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

    public class FileReader {
    // start of definition
    private BufferedReader bufferedReader;
    private static Path path;
    private String fileName;
    static List<String> lines;
    // end of definition

    // constructor (initialization phase)
        public FileReader(String fileName) {
        fileName = fileName;
        path = Paths.get(fileName);
        lines = new ArrayList<>();
    }

    public static List<String> readLines() {
        try (Stream<String> lineStream = Files.newBufferedReader(path).lines()) {
            lines = lineStream.collect(Collectors.toList());
        } catch (IOException ignored) {
        }
        return lines;
    }
}