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
    private static String isContinue;

    public static void main(String[] args) {
        init();

        outputView.printGameStartMessage();

        do {
            String number = inputUserNumber();
            checkStartOrRestart(number);
        } while (!isContinue.equals(NO_CONTINUE_ANSWER));
    }

    private static void init() {
        outputView = new OutputView();
        inputUI = new InputUI();
        numberBaseballGameController = new NumberBaseballGameController();
        isContinue = INIT_ANSWER;
    }

    private static void checkStartOrRestart(String number) {
        if (isContinue.equals(INIT_ANSWER)) {
            runStartGame(number);
            return;
        }

        runRestartGame(number);
    }

    private static void runStartGame(String number) {
        List<Integer> gameResult = numberBaseballGameController.startGame(number);
        outputView.printGameResult(gameResult);
        checkGameResult(gameResult);
    }

    private static void runRestartGame(String number) {
        List<Integer> gameResult = numberBaseballGameController.restartGame(number);
        outputView.printGameResult(gameResult);
        checkGameResult(gameResult);
    }

    private static String inputUserNumber() {
        outputView.printInputNumberMessage();
        String number = inputUI.inputUserNumber();

        return number;
    }

    private static void checkGameResult(List<Integer> gameResult) {
        isContinue = INIT_ANSWER;

        if (gameResult.get(STRIKE_INDEX) == PERFECT_STRIKE) {
            outputView.printGameSuccessMessage();
            outputView.printIsContinueMessage();
            isContinue = inputUI.inputIsContinue();
        }
    }
}
