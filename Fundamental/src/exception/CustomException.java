package exception;

public class CustomException extends Exception {
    private static final long serialVersionUID = 960024189286459220L;

    public CustomException(String message) {
        super(message);
    }
}
