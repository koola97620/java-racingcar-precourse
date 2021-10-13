package racinggame.domain;

public class RacingGame {

    private final Cars cars;
    private final Results results;
    private boolean isCompletedGame;

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
        isCompletedGame = true;
    }

    public String gameResult() {
        return results.gameResult();
    }

    public boolean isCompletedGame() {
        return isCompletedGame;
    }
}
