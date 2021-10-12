package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.exception.RacingCarException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {

    @DisplayName("자동차 이름의 길이는 1~5만 가능하다.")
    @ParameterizedTest
    @ValueSource(strings = {"", "carcar"})
    void given_noValidName_then_throwException(String input) {
        assertThatThrownBy(() -> CarName.of(input))
                .isInstanceOf(RacingCarException.class)
                .hasMessageContaining("[ERROR] 자동차 이름 길이는 1~5 자리 여야 합니다.");
    }

}