package racinggame.domain;

public class Car {

    private CarName carName;

    private Car(CarName carName) {
        this.carName = carName;
    }

    public static Car of(CarName carName) {
        return new Car(carName);
    }


}
