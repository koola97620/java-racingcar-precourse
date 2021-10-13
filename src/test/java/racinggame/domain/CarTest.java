package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.exception.RacingCarException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarTest {

    @DisplayName("자동차 이름의 길이는 1~5만 가능하다.")
    @ParameterizedTest
    @ValueSource(strings = {"ABCDEFG", "carcar"})
    void given_noValidLengthName_then_throwException(String input) {
        assertThatThrownBy(() -> Car.of(input))
                .isInstanceOf(RacingCarException.class)
                .hasMessageContaining("[ERROR] 자동차 이름 길이는 1~5 자리 여야 합니다.");
    }

    @DisplayName("자동차 이름의 길이는 null 이나 공백이면 안된다.")
    @ParameterizedTest
    @NullAndEmptySource
    void given_nullAndEmptyName_then_throwException(String input) {
        assertThatThrownBy(() -> Car.of(input))
                .isInstanceOf(RacingCarException.class)
                .hasMessageContaining("[ERROR] 입력값이 null 또는 공백이 되면 안됩니다.");
    }

}