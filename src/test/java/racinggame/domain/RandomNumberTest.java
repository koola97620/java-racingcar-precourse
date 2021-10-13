package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.exception.RacingCarException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RandomNumberTest {

    @DisplayName("RandomNumber 숫자는 0~9 사이의 숫자여야 합니다")
    @ParameterizedTest
    @ValueSource(ints = {-1,10})
    void validBoundary(int input) {
        assertThatThrownBy( () -> RandomNumber.of(input))
                .isInstanceOf(RacingCarException.class)
                .hasMessage("[ERROR] 랜덤숫자는 0~9 사이의 숫자여야 합니다.");
    }

}