package baseball.controller;

import baseball.model.service.NumberBaseballGameService;

import java.util.List;

public class NumberBaseballGameController {
    private NumberBaseballGameService baseballGameService;

    public NumberBaseballGameController() {
        baseballGameService = new NumberBaseballGameService();
    }

    public void startGame(String number) {
        List<Integer> randomNumbers = baseballGameService.findRandomNumbers();
        System.out.println(randomNumbers);

        doGame(randomNumbers, number);
    }

    private void doGame(List<Integer> randomNumbers, String number) {
        List<Integer> gameResult = baseballGameService.findGameResult(randomNumbers, number);
        System.out.println(gameResult);
    }

    private void endGame(String number) {

    }
}
