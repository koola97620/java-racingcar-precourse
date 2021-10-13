package racinggame;

import racinggame.domain.Cars;
import racinggame.view.InputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();

        String carNames = inputView.inputCarNames();
        Cars cars = Cars.of(carNames);
        Integer tryCount = inputView.inputTryCount();

    }
}
