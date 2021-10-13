package racinggame.domain;

import nextstep.utils.Randoms;

public class RandomMovable implements MovingStrategy {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;
    private static final int MOVING_CONDITION_NUMBER = 4;

    @Override
    public boolean movable() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER) >= MOVING_CONDITION_NUMBER;
    }

}
