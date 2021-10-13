package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class Results {
    private static final String WINNER_MESSAGE = "최종 우승자는 %s 입니다.";

    private final List<TryResults> tryResultsList;

    public Results() {
        tryResultsList = new ArrayList<>();
    }

    public void add(TryResults tryResults) {
        tryResultsList.add(tryResults);
    }

    public String gameResult() {
        StringBuilder builder = new StringBuilder();
        builder.append("실행결과").append("\n");

        for (TryResults tryResults : tryResultsList) {
            builder
                    .append(tryResults.result())
                    .append("\n");
        }
        builder.append(String.format(WINNER_MESSAGE, findWinners()));
        return builder.toString();
    }

    private String findWinners() {
        TryResults lastTryResult = tryResultsList.get(tryResultsList.size() - 1);
        return lastTryResult.findWinners();
    }
}
