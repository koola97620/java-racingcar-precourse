package racinggame.domain;

public class RacingGame {

    private final Cars cars;
    private final Results results;

    private RacingGame(Cars cars) {
        this.cars = cars;
        this.results = new Results();
    }

    public static RacingGame of(Cars cars) {
        return new RacingGame(cars);
    }

    public void raceStart(TryCount tryCount) {
        while (tryCount.availableContinueGame()) {
            TryResults tryResults = cars.move();
            results.add(tryResults);
            tryCount.race();
        }
    }

    public String gameResult() {
        return results.gameResult();
    }
}
