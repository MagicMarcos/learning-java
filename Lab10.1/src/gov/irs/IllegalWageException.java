package gov.irs;

public class IllegalWageException extends Exception{

    public IllegalWageException() { // no need to add super, but we do for practice here
        super(); // REMINDER: a superclass ctor is ALWAYS called
    }

    public IllegalWageException(String message) {
        super(message);
    }

    public IllegalWageException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalWageException(Throwable cause) {
        super(cause);
    }
}