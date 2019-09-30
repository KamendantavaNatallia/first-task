package by.epam.arrays.firsttask.exception;

import java.io.IOException;

public class LineReaderException extends IOException {
    public LineReaderException(String message) {
        super(message);
    }
    public LineReaderException(String message, Throwable cause) {
        super(message, cause);
    }
}
