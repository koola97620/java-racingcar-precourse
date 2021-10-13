package racinggame;

import racinggame.domain.Cars;
import racinggame.domain.RacingGame;
import racinggame.domain.TryCount;
import racinggame.exception.RacingCarException;
import racinggame.view.InputView;
import racinggame.view.PrintView;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        PrintView printView = new PrintView();

        RacingGame racingGame;
        do {
            racingGame = startGame(inputView, printView);
        } while (!isCompletedGame(racingGame));

        printView.printResult(racingGame.gameResult());
    }

    private static RacingGame startGame(InputView inputView, PrintView printView) {
        RacingGame racingGame = null;
        try {
            racingGame = RacingGame.of(Cars.of(inputView.inputCarNames()));
            racingGame.raceStart(TryCount.of(inputView.inputTryCount()));
        } catch (RacingCarException e) {
            printView.printErrorMessage(e.getMessage());
        }
        return racingGame;
    }

    private static boolean isCompletedGame(RacingGame racingGame) {
        return racingGame != null && racingGame.isCompletedGame();
    }

}
