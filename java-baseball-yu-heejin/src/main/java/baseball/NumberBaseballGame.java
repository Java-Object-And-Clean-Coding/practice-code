package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberBaseballGame {
    private final int NUMBER_SIZE = 3;
    private final int MIN_NUMBER = 1;
    private final int MAX_NUMBER = 9;
    private final int INIT_GAME_RESULT = 0;
    private final int STRIKE_INDEX = 0;
    private final int BALL_INDEX = 1;
    private final int NOTHING_INDEX = 2;
    private final char CHAR_TO_NUMBER = '0';
    private final String[] GAME_RESULT_MESSAGE = {"스트라이크", "볼", "낫싱"};
    private List<Integer> randomNumbers;
    private List<Integer> gameResultCount;

    public NumberBaseballGame() {
        randomNumbers = new ArrayList<>();
        gameResultCount = Arrays.asList(INIT_GAME_RESULT, INIT_GAME_RESULT);
        makeRandomNumber();
    }

    private void makeRandomNumber() {
        while (randomNumbers.size() < NUMBER_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
            insertRandomNumber(randomNumber);
        }
    }

    private void insertRandomNumber(int randomNumber) {
        if (!randomNumbers.contains(randomNumber)) {
            randomNumbers.add(randomNumber);
        }
    }

    public String getGameResult() {
        if (gameResultCount.get(BALL_INDEX) == 0 && gameResultCount.get(STRIKE_INDEX) > 0) {
            return gameResultCount.get(STRIKE_INDEX) + GAME_RESULT_MESSAGE[STRIKE_INDEX];
        }
        if (gameResultCount.get(BALL_INDEX) > 0 && gameResultCount.get(STRIKE_INDEX) > 0) {
            return gameResultCount.get(BALL_INDEX) + GAME_RESULT_MESSAGE[BALL_INDEX]
                    + " " + gameResultCount.get(STRIKE_INDEX) + GAME_RESULT_MESSAGE[STRIKE_INDEX];
        }
        if (gameResultCount.get(STRIKE_INDEX) == 0 && gameResultCount.get(BALL_INDEX) > 0) {
            return gameResultCount.get(BALL_INDEX) + GAME_RESULT_MESSAGE[BALL_INDEX];
        }
        return GAME_RESULT_MESSAGE[NOTHING_INDEX];
    }

    public void checkGameResult(String number) {
        for (int i = 0; i < NUMBER_SIZE; i++) {
            int dividedNumber = returnDividedNumber(number, i);
            countGameResult(i, dividedNumber);
        }
    }

    private int returnDividedNumber(String number, int index) {
        return number.charAt(index) - CHAR_TO_NUMBER;
    }

    public void countGameResult(int index, int dividedNumber) {
        if (randomNumbers.get(index) == dividedNumber) {
            int countTempForIncrease = gameResultCount.get(STRIKE_INDEX) + 1;
            gameResultCount.set(STRIKE_INDEX, countTempForIncrease);
            return;
        }
        if (randomNumbers.contains(dividedNumber)) {
            int countTempForIncrease = gameResultCount.get(BALL_INDEX) + 1;
            gameResultCount.set(BALL_INDEX, countTempForIncrease);
        }
    }

    public void clearRandomNumberByG\ameContinueAnswer(String gameContinueAnswer) {
        if (gameContinueAnswer.equals("1")) {
            randomNumbers.clear();
        }
    }
}
