package racinggame.exception;

public enum ErrorCode {
    CAR_NAME_LENGTH_BOUNDARY_ERROR("자동차 이름 길이는 1~5 자리 여야 합니다.");

    private String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
