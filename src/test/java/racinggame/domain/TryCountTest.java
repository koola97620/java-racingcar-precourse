package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.exception.RacingCarException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TryCountTest {

    @DisplayName("시도회수는 0보다 큰 양수여야 합니다.")
    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 0})
    void given_lessThanZero_then_throwException(int input) {
        assertThatThrownBy(() -> TryCount.of(input))
                .isInstanceOf(RacingCarException.class)
                .hasMessage("[ERROR] 시도 회수는 0보다 커야 합니다.");
    }
}
