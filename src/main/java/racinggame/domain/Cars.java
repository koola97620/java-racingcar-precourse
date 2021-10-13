package racinggame.domain;

import nextstep.utils.Randoms;
import racinggame.util.ValidUtils;

import java.util.List;
import java.util.Random;

public class Cars {

    private final List<Car> cars;

    private Cars(String carNames) {
        validate(carNames);
        cars = CarFactory.createCarList(carNames);
    }

    public static Cars of(String carNames) {
        return new Cars(carNames);
    }

    private static void validate(String carNames) {
        ValidUtils.nullOrEmpty(carNames);
    }

    public void move() {
        for (Car car : cars) {
            car.move(Randoms.pickNumberInRange(0,9));
        }

    }
}
