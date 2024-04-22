package day10.exception;

public class InvalidLoginInputException extends Exception {

    public InvalidLoginInputException() {
    }

    public InvalidLoginInputException(String message) {
        super(message);
    }
}
