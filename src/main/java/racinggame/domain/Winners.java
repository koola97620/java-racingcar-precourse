package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class Winners {

    private final List<String> winners;

    public Winners() {
        winners = new ArrayList<>();
    }

    public void addWinner(TryResult tryResult, Position maxPosition) {
        if (tryResult.isSamePosition(maxPosition)) {
            winners.add(tryResult.getCarName());
        }
    }

    public String names() {
        return String.join(",", winners);
    }
}
