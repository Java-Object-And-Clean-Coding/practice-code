package baseball.model.domain;

public enum ViewMessage {
    START("숫자 야구 게임을 시작합니다."),
    INPUT("숫자를 입력해주세요 : "),
    SUCCESS("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    QUESTION_CONTINUE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    String viewMessage;

    ViewMessage(String viewMessage) {
        this.viewMessage = viewMessage;
    }

    public String getViewMessage() {
        return viewMessage;
    }
}
