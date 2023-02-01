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
        String isContinue = "1";

        outputView.printGameStartMessage();

        while (isContinue.equals("1")) {
            outputView.printInputNumberMessage();
            String number = inputUI.inputUserNumber();

            List<Integer> gameResult = numberBaseballGameController.startGame(number);
            outputView.printGameResult(gameResult);

            if (gameResult.get(0) == 3) {
                outputView.printGameSuccessMessage();
                outputView.printIsContinueMessage();
                isContinue = inputUI.inputIsContinue();
            }
        }
    }
}
