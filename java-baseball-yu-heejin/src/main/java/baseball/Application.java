package baseball;

import baseball.controller.NumberBaseballGameController;
import baseball.view.InputUI;
import baseball.view.OutputView;

import java.util.List;

public class Application {
    private static final OutputView OUTPUT_VIEW = new OutputView();
    private static final InputUI INPUT_UI = new InputUI();
    private static final NumberBaseballGameController NUMBER_BASEBALL_GAME_CONTROLLER = new NumberBaseballGameController();

    public static void main(String[] args) {
        OUTPUT_VIEW.printGameStartMessage();
        String isContinueAnswer = "-1";

        OUTPUT_VIEW.printInputNumberMessage();
        String number = INPUT_UI.inputUserNumber();

        List<Integer> gameResults = NUMBER_BASEBALL_GAME_CONTROLLER.startGame(number);

        OUTPUT_VIEW.printGameResult(gameResults);

        if (gameResults.get(0) == 3) {
            OUTPUT_VIEW.printGameSuccessMessage();
            OUTPUT_VIEW.printIsContinueMessage();
            isContinueAnswer = INPUT_UI.inputIsContinue();
        }

        if (isContinueAnswer.equals("1")) {
            gameResults = NUMBER_BASEBALL_GAME_CONTROLLER.startGame(number);
        }




    }
}
