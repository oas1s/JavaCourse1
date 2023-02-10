public class SquareException extends Exception{
    public SquareException() {
    }

    public SquareException(String message) {
        super(message);
    }

    public SquareException(String message, Throwable cause) {
        super(message, cause);
    }

    public SquareException(Throwable cause) {
        super(cause);
    }

    public SquareException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
