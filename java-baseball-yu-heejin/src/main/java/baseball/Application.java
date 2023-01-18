package baseball;

import baseball.controller.NumberBaseballGameController;
import baseball.view.InputUI;
import baseball.view.OutputView;

import java.util.List;

public class Application {
    private static OutputView outputView;
    private static InputUI inputUI;
    private static NumberBaseballGameController numberBaseballGameController;

    public Application() {
        outputView = new OutputView();
        inputUI = new InputUI();
        numberBaseballGameController = new NumberBaseballGameController();
    }

    public static void main(String[] args) {
        String number = inputNumber();
        System.out.println(number);

        List<Integer> gameResult = numberBaseballGameController.startGame(number);
        outputView.printGameResult(gameResult);
    }

    public static String inputNumber() {
        outputView.printGameStartMessage();
        outputView.printInputNumberMessage();

        return inputUI.inputUserNumber();
    }
}
