package baseball.controller;

import baseball.model.service.NumberBaseballGameService;

import java.util.List;

public class NumberBaseballGameController {
    private NumberBaseballGameService baseballGameService;

    public NumberBaseballGameController() {
        baseballGameService = new NumberBaseballGameService();
    }

    public void startGame(String number) {
        List<Integer> randomNumbers = baseballGameService.getRandomNumbers();
        List<Integer> gameResult = baseballGameService.createGameResult(randomNumbers, number);

        System.out.println(randomNumbers);
        System.out.println(gameResult);
    }
}
