package by.epam.arrays.firsttask.reader;

import by.epam.arrays.firsttask.exception.LineReaderException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

    public class TxtReader {
        private String fileName;

    public TxtReader(String fileName) {
        this.fileName = fileName;
    }

    public List<String> readLines() throws IOException {
        List<String> lines = new ArrayList<>();
        Path path = Paths.get(fileName);

        try (Stream<String> lineStream = Files.newBufferedReader(path).lines()) {
            lines = lineStream.collect(Collectors.toList());
        } catch (IOException e) {
            e = new LineReaderException("A problem with lines reading");
        }
        return lines;
    }
}