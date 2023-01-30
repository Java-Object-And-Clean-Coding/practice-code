package baseball.model.repository;

import baseball.model.domain.NumberBaseballGame;

import java.util.List;

public class NumberBaseballGameRepository {
    private NumberBaseballGame numberBaseballGame;

    public NumberBaseballGameRepository() {
        this.numberBaseballGame = new NumberBaseballGame();
    }

    public List<Integer> findRandomNumbers() {
        return numberBaseballGame.getRandomNumbers();
    }

    public List<Integer> findGameResult() {
        return numberBaseballGame.getGameResult();
    }

    public void updateGameResult(List<Integer> gameResult) {
        numberBaseballGame.updateGameResult(gameResult);
    }
}
