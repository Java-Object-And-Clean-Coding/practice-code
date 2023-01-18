package baseball.model.repository;

import baseball.model.domain.NumberBaseballGame;

import java.util.Arrays;
import java.util.List;

public class NumberBaseballGameRepository {
    private final int INIT_RESULT_VALUE = 0;
    private NumberBaseballGame numberBaseballGame;

    public NumberBaseballGameRepository() {
        this.numberBaseballGame = new NumberBaseballGame();
    }

    public NumberBaseballGame getNumberBaseballGame() {
        return numberBaseballGame;
    }
}
