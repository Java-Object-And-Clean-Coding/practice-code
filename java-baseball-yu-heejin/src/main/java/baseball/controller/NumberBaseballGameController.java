package baseball.controller;

import baseball.model.service.NumberBaseballGameService;

import java.util.List;

public class NumberBaseballGameController {
    private NumberBaseballGameService baseballGameService;

    public NumberBaseballGameController() {
        baseballGameService = new NumberBaseballGameService();
    }

    public List<Integer> restartGame(String number) {
        baseballGameService.updateRandomNumbers();
        return startGame(number);
    }

    public List<Integer> startGame(String number) {
        List<Integer> randomNumbers = baseballGameService.findRandomNumbers();
        System.out.println(randomNumbers);
        return doGame(randomNumbers, number);
    }

    private List<Integer> doGame(List<Integer> randomNumbers, String number) {
        List<Integer> gameResult = baseballGameService.findGameResult(randomNumbers, number);
        return gameResult;
    }
}
