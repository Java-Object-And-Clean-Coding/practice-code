package baseball.controller;

import baseball.model.service.NumberBaseballGameService;

import java.util.List;

public class NumberBaseballGameController {
    private final NumberBaseballGameService BASEBALL_GAME_SERVICE = new NumberBaseballGameService();
    public void startGame(String number) {
        List<Integer> randomNumbers = BASEBALL_GAME_SERVICE.getRandomNumbers();

        System.out.println(randomNumbers);

        System.out.println(BASEBALL_GAME_SERVICE.getGameResult(randomNumbers, number));

    }
}
