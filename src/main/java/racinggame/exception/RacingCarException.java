package racinggame.exception;

public class RacingCarException extends RuntimeException {
    public RacingCarException(String message) {
        super(String.format("[ERROR] %s",message));
    }
}
