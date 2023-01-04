package baseball.model.domain;

public enum ResultMessage {
    STRIKE("스트라이크"),
    NOTHING("낫싱"),
    BALL("볼");

    String resultMessage;

    ResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public String getResultMessage() {
        return resultMessage;
    }
}
