package racinggame.domain;

import nextstep.utils.Randoms;

public class RandomMovable implements MovingStrategy {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;

    @Override
    public boolean movable() {
        RandomNumber randomNumber = createRandomNumber();
        return randomNumber.isMovable();
    }

    private RandomNumber createRandomNumber() {
        return RandomNumber.of(Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER));
    }
}
