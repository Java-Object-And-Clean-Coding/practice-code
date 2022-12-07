package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    private static NumberBaseballGame numberBaseballGame;
    private static InputView inputView;
    private static OutputView outputView;

    public static void init() {
        numberBaseballGame = new NumberBaseballGame();
        inputView = new InputView();
        outputView = new OutputView();
    }

    public static void main(String[] args) {
        init();

        while (true) {
            String number = inputView.inputNumber();
            if (number == null) {
                return;
                // TODO: 게임을 종료시키는 방법은 무엇일까?
            }

            numberBaseballGame.checkGameResult(number);
        }





    }
}
