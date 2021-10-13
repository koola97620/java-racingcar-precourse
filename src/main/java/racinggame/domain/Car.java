package racinggame.domain;

import racinggame.util.ValidUtils;

public class Car {

    private CarName carName;

    private Car(CarName carName) {
        this.carName = carName;
    }

    public static Car of(String carName) {
        validate(carName);
        return new Car(CarName.of(carName));
    }

    private static void validate(String carName) {
        ValidUtils.nullOrEmpty(carName);
    }


}
