package racinggame.domain;

import racinggame.exception.ErrorCode;
import racinggame.exception.RacingCarException;

import java.util.Objects;

public class Position {
    private static final int MIN_POSITION = 0;
    private static final int MOVE_ONE = 1;

    private int position;

    private Position(int position) {
        this.position = position;
    }

    public static Position of(int position) {
        validate(position);
        return new Position(position);
    }

    private static void validate(int position) {
        if (position < MIN_POSITION) {
            throw new RacingCarException(ErrorCode.POSITION_BOUNDARY_ERROR.getMessage());
        }
    }

    public Position move() {
        return Position.of(position + MOVE_ONE);
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
