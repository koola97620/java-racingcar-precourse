package racinggame.exception;

public enum ErrorCode {
    CAR_NAME_LENGTH_BOUNDARY_ERROR("자동차 이름 길이는 1~5 자리 여야 합니다."),
    INPUT_NAME_NULL_OR_EMPTY("입력값이 null 또는 공백이 되면 안됩니다."),
    INPUT_TRY_COUNT_ERROR("시도 회수는 0보다 커야 합니다."),
    POSITION_BOUNDARY_ERROR("위치는 0 이상이어야 합니다.");

    private String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
