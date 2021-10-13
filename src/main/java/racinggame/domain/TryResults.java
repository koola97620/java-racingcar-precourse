package racinggame.domain;

import java.util.List;

public class TryResults {
    private static final String DIVIDER = " : ";

    private final List<TryResult> tryResults;

    private TryResults(List<TryResult> tryResults) {
        this.tryResults = tryResults;
    }

    public static TryResults of(List<TryResult> tryResults) {
        return new TryResults(tryResults);
    }

    public String result() {
        StringBuilder builder = new StringBuilder();
        for (TryResult tryResult : tryResults) {
            builder.
                    append(tryResult.getCarName())
                    .append(DIVIDER)
                    .append(tryResult.draw())
                    .append("\n")
            ;
        }
        return builder.toString();
    }

    public String findWinners() {
        Winners winners = new Winners();
        Position maxPosition = getMaxPosition();
        for (TryResult tryResult : tryResults) {
            winners.addWinner(tryResult, maxPosition);
        }
        return winners.names();
    }

    private Position getMaxPosition() {
        int maxPosition = 0;
        for (TryResult tryResult : tryResults) {
            maxPosition = Math.max(maxPosition, tryResult.getPosition());
        }
        return Position.of(maxPosition);
    }
}
