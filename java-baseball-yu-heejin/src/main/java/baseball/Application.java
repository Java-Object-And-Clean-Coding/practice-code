package baseball;

import baseball.controller.NumberBaseballGameController;
import baseball.view.InputUI;
import baseball.view.OutputView;

import java.util.List;

public class Application {
    private static OutputView outputView;
    private static InputUI inputUI;
    private static NumberBaseballGameController numberBaseballGameController;

    public static void main(String[] args) {
        outputView = new OutputView();
        inputUI = new InputUI();
        numberBaseballGameController = new NumberBaseballGameController();

        outputView.printGameStartMessage();

        outputView.printInputNumberMessage();
        String number = inputUI.inputUserNumber();

        List<Integer> gameResult = numberBaseballGameController.startGame(number);
    }
}
