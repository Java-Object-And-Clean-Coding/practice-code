package baseball.model.service;

import baseball.model.domain.NumberBaseballGame;

import java.util.List;

public class NumberBaseballGameService {
    private NumberBaseballGame numberBaseballGame;

    public NumberBaseballGameService() {
        numberBaseballGame = new NumberBaseballGame();
    }

    public List<Integer> getRandomNumbers() {
        return numberBaseballGame.getRandomNumbers();
    }

    public List<Integer> getGameResult(String number) {
        return numberBaseballGame.getGameResult(number);
    }
}
