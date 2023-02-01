package baseball;

import baseball.controller.NumberBaseballGameController;
import baseball.view.InputUI;
import baseball.view.OutputView;

import java.util.List;

public class Application {
    private static final String CONTINUE_ANSWER = "1";
    private static final int STRIKE_INDEX = 0;
    private static final int PERFECT_STRIKE = 3;
    private static OutputView outputView;
    private static InputUI inputUI;
    private static NumberBaseballGameController numberBaseballGameController;

    public static void main(String[] args) {
        outputView = new OutputView();
        inputUI = new InputUI();
        numberBaseballGameController = new NumberBaseballGameController();
        String isContinue = CONTINUE_ANSWER;

        outputView.printGameStartMessage();

        while (isContinue.equals(CONTINUE_ANSWER)) {
            outputView.printInputNumberMessage();
            String number = inputUI.inputUserNumber();

            List<Integer> gameResult = numberBaseballGameController.startGame(number);
            outputView.printGameResult(gameResult);

            if (gameResult.get(STRIKE_INDEX) == PERFECT_STRIKE) {
                outputView.printGameSuccessMessage();
                outputView.printIsContinueMessage();
                isContinue = inputUI.inputIsContinue();
            }
        }
    }
}
