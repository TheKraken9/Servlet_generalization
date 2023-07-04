package etu2663.framework.exceptions;

public class JavaFileException extends Exception {
    public JavaFileException() {
        super("ERROR: This is not a java file");
    }

    public JavaFileException(String message) {
        super("ERROR: " + message);
    }
}
