package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.exception.RacingCarException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PositionTest {

    @DisplayName("0 이상의 수여야 합니다.")
    @ParameterizedTest
    @ValueSource(ints = {-2,-1})
    void validBoundary(int input) {
        assertThatThrownBy( () -> Position.of(input))
                .isInstanceOf(RacingCarException.class)
                .hasMessage("[ERROR] 위치는 0 이상이어야 합니다.");
    }

    @DisplayName("move 실행시 position 이 1증가한다")
    @Test
    void move() {
        Position position = Position.of(1);
        assertThat(position.move()).isEqualTo(Position.of(2));
    }

}