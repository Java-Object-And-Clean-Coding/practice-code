package baseball.model.repository;

import baseball.model.domain.NumberBaseballGame;

import java.util.List;

public class NumberBaseballGameRepository {
    private NumberBaseballGame numberBaseballGame;

    public NumberBaseballGameRepository() {
        this.numberBaseballGame = new NumberBaseballGame();
    }

    public List<Integer> getRandomNumbers() {
        return numberBaseballGame.getRandomNumbers();
    }

    public List<Integer> getGameResult() {
        return numberBaseballGame.getGameResult();
    }

    public void setGameResult(List<Integer> gameResult) {
        numberBaseballGame.setGameResult(gameResult);
    }
}
