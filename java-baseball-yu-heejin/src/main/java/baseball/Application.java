package baseball;

import baseball.controller.NumberBaseballGameController;
import baseball.view.InputUI;
import baseball.view.OutputView;

import java.util.List;

public class Application {
    private static final String CONTINUE_ANSWER = "1";
    private static final String NO_CONTINUE_ANSWER = "2";
    private static final String INIT_ANSWER = "-1";
    private static final int STRIKE_INDEX = 0;
    private static final int PERFECT_STRIKE = 3;
    private static OutputView outputView;
    private static InputUI inputUI;
    private static NumberBaseballGameController numberBaseballGameController;

    public static void main(String[] args) {
        outputView = new OutputView();
        inputUI = new InputUI();
        numberBaseballGameController = new NumberBaseballGameController();
        String isContinue = INIT_ANSWER;

        outputView.printGameStartMessage();

        do {
            String number = inputUserNumber();

            if (isContinue.equals(INIT_ANSWER)) {
                List<Integer> gameResult = numberBaseballGameController.startGame(number);
                outputView.printGameResult(gameResult);
                checkGameResult(gameResult);
            } else {
                List<Integer> gameResult = numberBaseballGameController.restartGame(number);
                outputView.printGameResult(gameResult);
                checkGameResult(gameResult);
            }
        } while (!isContinue.equals(NO_CONTINUE_ANSWER));
    }

    private static String inputUserNumber() {
        outputView.printInputNumberMessage();
        String number = inputUI.inputUserNumber();

        return number;
    }

    private static String checkGameResult(List<Integer> gameResult) {
        String isContinue = INIT_ANSWER;

        if (gameResult.get(STRIKE_INDEX) == PERFECT_STRIKE) {
            outputView.printGameSuccessMessage();
            outputView.printIsContinueMessage();
            isContinue = inputUI.inputIsContinue();
        }

        return isContinue;
    }
}
