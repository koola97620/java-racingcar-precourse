package racinggame.domain;

public class RacingGame {

    private Cars cars;

    private RacingGame(Cars cars) {
        this.cars = cars;
    }

    public static RacingGame of(Cars cars) {
        return new RacingGame(cars);
    }

    public void raceStart(TryCount tryCount) {
        while (tryCount.availableContinueGame()) {
            cars.move();
            tryCount.race();
        }
    }
}
