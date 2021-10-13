package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class TryResultsTest {

    @DisplayName("우승자 한명 출력")
    @Test
    void one_winner() {
        TryResults tryResults = TryResults.of(
                Arrays.asList(
                        TryResult.of(CarName.of("a"), Position.of(1)),
                        TryResult.of(CarName.of("b"), Position.of(4)),
                        TryResult.of(CarName.of("c"), Position.of(2))
                )
        );
        assertThat(tryResults.findWinners()).isEqualTo("b");
    }

    @DisplayName("우승자 두명 출력")
    @Test
    void two_winners() {
        TryResults tryResults = TryResults.of(
                Arrays.asList(
                        TryResult.of(CarName.of("a"), Position.of(1)),
                        TryResult.of(CarName.of("b"), Position.of(4)),
                        TryResult.of(CarName.of("c"), Position.of(4))
                )
        );
        assertThat(tryResults.findWinners()).isEqualTo("b,c");
    }

}