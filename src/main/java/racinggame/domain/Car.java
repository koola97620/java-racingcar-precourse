package racinggame.domain;

import racinggame.util.ValidUtils;

public class Car {
    private static final int DEFAULT_POSITION = 0;

    private CarName carName;
    private Position position;

    private Car(CarName carName, Position position) {
        this.carName = carName;
        this.position = position;
    }

    public static Car of(String carName) {
        validate(carName);
        return new Car(CarName.of(carName), Position.of(DEFAULT_POSITION));
    }

    private static void validate(String carName) {
        ValidUtils.nullOrEmpty(carName);
    }

    public TryResult move(MovingStrategy movable) {
        if (movable.movable()) {
            this.position = position.move();
        }
        return TryResult.of(carName, position);
    }

    public Position getPosition() {
        return position;
    }
}
