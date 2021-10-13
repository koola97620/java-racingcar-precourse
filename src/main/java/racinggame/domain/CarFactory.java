package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    public static List<Car> createCarList(String carNames) {
        String[] splitCarNames = carNames.split(",");
        List<Car> cars = new ArrayList<>();
        for (String carName : splitCarNames) {
            cars.add(Car.of(carName));
        }
        return cars;
    }
}
