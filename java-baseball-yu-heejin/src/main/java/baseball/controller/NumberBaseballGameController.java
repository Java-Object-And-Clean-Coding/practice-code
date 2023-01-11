package baseball.controller;

import baseball.model.service.NumberBaseballGameService;

import java.util.List;

public class NumberBaseballGameController {
    private final NumberBaseballGameService BASEBALL_GAME_SERVICE = new NumberBaseballGameService();

    public List<Integer> startGame(String number) {
        List<Integer> gameResults = BASEBALL_GAME_SERVICE.getGameResult(number);
        return gameResults;
    }
}
