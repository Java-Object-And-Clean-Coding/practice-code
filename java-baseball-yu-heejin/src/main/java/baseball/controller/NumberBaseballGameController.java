package baseball.controller;

import baseball.model.domain.NumberBaseballGame;
import baseball.model.service.NumberBaseballGameService;

import java.util.List;

public class NumberBaseballGameController {
    private NumberBaseballGameService baseballGameService;

    public NumberBaseballGameController() {
        baseballGameService = new NumberBaseballGameService();
    }

    public void startGame(String number) {
        NumberBaseballGame numberBaseballGame = baseballGameService.getNumberBaseballGame();

        System.out.println(numberBaseballGame.getRandomNumbers());
    }
}
