package core.Task2;


public class UnknownKeyException extends RuntimeException{
    public UnknownKeyException() {
        super("Unknown key in order map");
    }
}
