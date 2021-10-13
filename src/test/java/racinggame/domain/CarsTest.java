package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import racinggame.exception.RacingCarException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarsTest {

    @DisplayName("자동차 이름 입력값이 null 또는 공백이면 예외가 발생한다.")
    @ParameterizedTest
    @NullAndEmptySource
    void create(String input) {
        assertThatThrownBy(() -> Cars.of(input))
                .isInstanceOf(RacingCarException.class)
                .hasMessage("[ERROR] 입력값이 null 또는 공백이 되면 안됩니다.");
    }

}