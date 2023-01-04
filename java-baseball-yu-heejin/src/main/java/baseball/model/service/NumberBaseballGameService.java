package baseball.model.service;

import baseball.model.domain.NumberBaseballGame;

import java.util.List;

public class NumberBaseballGameService {
    private NumberBaseballGame NUMBER_BASEBALL_GAME;

    public NumberBaseballGameService() {
        NUMBER_BASEBALL_GAME = new NumberBaseballGame();
    }

    public List<Integer> getRandomNumbers() {
        return NUMBER_BASEBALL_GAME.getRandomNumbers();
    }

    public List<Integer> getGameResult(List<Integer> randomNumbers, String number) {
        return NUMBER_BASEBALL_GAME.checkGameResult(number);
    }
}
