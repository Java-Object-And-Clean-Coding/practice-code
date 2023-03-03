package baseball.view.model;

public enum OutputMessage {
    START_GAME("숫자 야구 게임을 시작합니다."),
    END_GAME("3개의 숫자를 모두 맞추셨습니다! 게임 종료.");

    private String message;
    OutputMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
