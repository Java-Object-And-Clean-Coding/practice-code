package baseball;

import baseball.controller.NumberBaseballGameController;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    private static final InputView INPUT_VIEW = new InputView();
    private static final OutputView OUTPUT_VIEW = new OutputView();
    private static final NumberBaseballGameController NUMBER_BASEBALL_GAME_CONTROLLER = new NumberBaseballGameController();

    public static void main(String[] args) {
        NUMBER_BASEBALL_GAME_CONTROLLER.gameStart();
    }
}
