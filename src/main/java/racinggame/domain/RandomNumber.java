package racinggame.domain;

import racinggame.exception.ErrorCode;
import racinggame.exception.RacingCarException;

public class RandomNumber {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;
    private static final int MOVING_CONDITION_NUMBER = 4;

    private int number;

    private RandomNumber(int number) {
        validate(number);
        this.number = number;
    }

    public static RandomNumber of(int number) {
        return new RandomNumber(number);
    }

    private void validate(int number) {
        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new RacingCarException(ErrorCode.RANDOM_NUMBER_BOUNDARY_ERROR.getMessage());
        }
    }

    public boolean isMovable() {
        return number >= MOVING_CONDITION_NUMBER;
    }
}
