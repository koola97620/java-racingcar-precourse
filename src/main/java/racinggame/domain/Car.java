package racinggame.domain;

import racinggame.exception.ErrorCode;
import racinggame.exception.RacingCarException;

public class Car {

    private String input;

    public Car(String input) {
        validate(input);
        this.input = input;
    }

    private void validate(String input) {
        if (input.length() < 1 || input.length() > 5) {
            throw new RacingCarException(ErrorCode.CAR_NAME_LENGTH_BOUNDARY_ERROR.getMessage());
        }
    }
}
