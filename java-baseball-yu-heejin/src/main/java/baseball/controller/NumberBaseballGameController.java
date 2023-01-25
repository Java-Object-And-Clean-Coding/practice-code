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
    }

    private void doGame(String number) {

    }

    private void endGame(String number) {

    }
}
