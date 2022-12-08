package baseball.view;

import baseball.NumberBaseballGame;

public class OutputView {
    private final NumberBaseballGame NUMBER_BASEBALL_GAME;

    public OutputView() {
        this.NUMBER_BASEBALL_GAME = new NumberBaseballGame();
    }
    public void printGameResult(String message) {
        System.out.println(message);
    }

    public void printSuccessGameMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void printInputGameContinueAnswerMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public void printGameStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        System.out.print("숫자를 입력해주세요 : ");
    }

}
