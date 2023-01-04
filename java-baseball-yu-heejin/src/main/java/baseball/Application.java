package baseball;

import baseball.controller.NumberBaseballGameController;
import baseball.view.InputUI;
import baseball.view.OutputView;

public class Application {
    private static final OutputView OUTPUT_VIEW = new OutputView();
    private static final InputUI INPUT_UI = new InputUI();
    private static final NumberBaseballGameController NUMBER_BASEBALL_GAME_CONTROLLER = new NumberBaseballGameController();

    public static void main(String[] args) {
        OUTPUT_VIEW.printGameStartMessage();

        OUTPUT_VIEW.printInputNumberMessage();
        String number = INPUT_UI.inputUserNumber();

        NUMBER_BASEBALL_GAME_CONTROLLER.startGame(number);
    }
}
