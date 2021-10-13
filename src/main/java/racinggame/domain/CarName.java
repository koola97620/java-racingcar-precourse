package racinggame.domain;

import racinggame.exception.ErrorCode;
import racinggame.exception.RacingCarException;

public class CarName {
    private static final Integer MIN_CAR_LENGTH = 1;
    private static final Integer MAX_CAR_LENGTH = 5;

    private final String name;

    private CarName(String name) {
        validate(name);
        this.name = name;
    }

    public static CarName of(String name) {
        return new CarName(name);
    }

    private void validate(String input) {
        if (input.length() < MIN_CAR_LENGTH || input.length() > MAX_CAR_LENGTH) {
            throw new RacingCarException(ErrorCode.CAR_NAME_LENGTH_BOUNDARY_ERROR.getMessage());
        }
    }

    public String getName() {
        return name;
    }
}
