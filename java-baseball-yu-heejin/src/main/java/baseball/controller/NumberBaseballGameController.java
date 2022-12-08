package baseball.controller;

import baseball.NumberBaseballGame;
import baseball.model.domain.RandomNumbers;

public class NumberBaseballGameController {
    private final NumberBaseballGame NUMBER_BASEBALL_GAME;
    private RandomNumbers randomNumbers;

    public NumberBaseballGameController() {
        this.NUMBER_BASEBALL_GAME = new NumberBaseballGame();
        this.randomNumbers = new RandomNumbers();
    }

    public void gameStart() {
        OUTPUT_VIEW.printGameStartMessage();
        String number = INPUT_VIEW.inputNumber();

        play(number);
    }

    private void play(String number) {

    }
}
