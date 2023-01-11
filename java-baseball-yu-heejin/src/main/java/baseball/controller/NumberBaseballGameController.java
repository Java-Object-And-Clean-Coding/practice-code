package baseball.controller;

import baseball.model.service.NumberBaseballGameService;

import java.util.List;

public class NumberBaseballGameController {
    private NumberBaseballGameService baseballGameService;

    public NumberBaseballGameController() {
        baseballGameService = new NumberBaseballGameService();
    }

    public List<Integer> startGame(String number) {
        List<Integer> gameResults = baseballGameService.getGameResult(number);
        return gameResults;
    }
}
