package baseball;

import baseball.view.InputView;
import baseball.view.OutputView;

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

    }
}
