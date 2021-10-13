package racinggame.domain;

import racinggame.util.ValidUtils;

import java.util.List;

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
}
