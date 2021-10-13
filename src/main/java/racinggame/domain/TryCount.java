package racinggame.domain;

import racinggame.exception.ErrorCode;
import racinggame.exception.RacingCarException;

public class TryCount {
    private static final Integer MIN_TRY_COUNT = 1;

    private int tryCount;

    private TryCount(int tryCount) {
        validate(tryCount);
        this.tryCount = tryCount;
    }

    public static TryCount of(int tryCount) {
        return new TryCount(tryCount);
    }

    private void validate(int tryCount) {
        if (tryCount < MIN_TRY_COUNT) {
            throw new RacingCarException(ErrorCode.INPUT_TRY_COUNT_ERROR.getMessage());
        }
    }

    public boolean availableContinueGame() {
        return tryCount >= MIN_TRY_COUNT;
    }

    public void race() {
        this.tryCount--;
    }
}
