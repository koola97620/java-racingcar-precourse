package racinggame.domain;

import racinggame.util.ValidUtils;

import java.util.ArrayList;
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

    public TryResults move() {
        List<TryResult> tryResults = new ArrayList<>();
        for (Car car : cars) {
            tryResults.add(car.move(new RandomMovable()));
        }
        return TryResults.of(tryResults);
    }
}
