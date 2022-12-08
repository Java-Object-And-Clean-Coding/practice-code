package baseball.controller;

import baseball.NumberBaseballGame;
import baseball.view.InputView;
import baseball.view.OutputView;

public class NumberBaseballGameController {
    private final OutputView OUTPUT_VIEW;
    private final InputView INPUT_VIEW;
    private final NumberBaseballGame NUMBER_BASEBALL_GAME;

    public NumberBaseballGameController() {
        this.OUTPUT_VIEW = new OutputView();
        this.INPUT_VIEW = new InputView();
        this.NUMBER_BASEBALL_GAME = new NumberBaseballGame();
    }

    public void gameStart() {
        OUTPUT_VIEW.printGameStartMessage();
        String number = INPUT_VIEW.inputNumber();

        play(number);
    }

    private void play(String number) {
        NUMBER_BASEBALL_GAME
    }
}
