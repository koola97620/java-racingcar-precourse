package racinggame.util;

import racinggame.exception.ErrorCode;
import racinggame.exception.RacingCarException;

public class ValidUtils {
    public static void nullOrEmpty(String input) {
        if (input == null || input.equals("")) {
            throw new RacingCarException(ErrorCode.INPUT_NAME_NULL_OR_EMPTY.getMessage());
        }
    }
}
