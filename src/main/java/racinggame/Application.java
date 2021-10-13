package racinggame;

import racinggame.domain.Cars;
import racinggame.domain.RacingGame;
import racinggame.domain.TryCount;
import racinggame.view.InputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();

        RacingGame racingGame = RacingGame.of(Cars.of(inputView.inputCarNames()));
        racingGame.raceStart(TryCount.of(inputView.inputTryCount()));
    }
}
