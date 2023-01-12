package baseball.model.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberBaseballGame {
    private final int MAX_NUMBERS_SIZE = 3;
    private final int MIN_NUMBER_RANGE = 1;
    private final int MAX_NUMBER_RANGE = 9;
    private final int INIT_RESULT_VALUE = 0;
    private final int STRIKE_INDEX = 0;
    private final int BALL_INDEX = 1;

    private List<Integer> randomNumbers;
    private List<Integer> gameResult;

    public NumberBaseballGame() {
        randomNumbers = makeRandomNumbers();
        gameResult = Arrays.asList(INIT_RESULT_VALUE, INIT_RESULT_VALUE);
    }

    private List<Integer> makeRandomNumbers() {
        randomNumbers = new ArrayList<>();

        while (randomNumbers.size() < MAX_NUMBERS_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(MIN_NUMBER_RANGE, MAX_NUMBER_RANGE);
            initRandomNumber(randomNumber);
        }

        return randomNumbers;
    }

    private void initRandomNumber(int randomNumber) {
        if (!randomNumbers.contains(randomNumber)) {
            randomNumbers.add(randomNumber);
        }
    }

    public List<Integer> getRandomNumbers() {
        return this.randomNumbers;
    }

    public List<Integer> getGameResult(String number) {
        for (int numberIndex = 0; numberIndex < randomNumbers.size(); numberIndex++) {
            int numberByCharAt = Integer.parseInt(String.valueOf(number.charAt(numberIndex)));
            initGameResult(numberIndex, numberByCharAt);
        }

        return gameResult;
    }

    private void initGameResult(int numberIndex, int numberByCharAt) {
        if (randomNumbers.get(numberIndex) == numberByCharAt) {
            int result = gameResult.get(STRIKE_INDEX) + 1;
            gameResult.set(STRIKE_INDEX, result);
            return;
        }

        if (randomNumbers.contains(numberByCharAt)) {
            int result = gameResult.get(BALL_INDEX) + 1;
            gameResult.set(BALL_INDEX, result);
        }
    }
}
