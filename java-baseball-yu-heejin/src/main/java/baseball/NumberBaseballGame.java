package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberBaseballGame {
    private static final int NUMBER_SIZE = 3;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private static final int INIT_GAME_RESULT = 0;
    private static final int STRIKE_INDEX = 0;
    private static final int BALL_INDEX = 1;
    private static final char CHAR_TO_NUMBER = '0';
    private static List<Integer> randomNumbers;
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

    public static void insertRandomNumber(int randomNumber) {
        if (!randomNumbers.contains(randomNumber)) {
            randomNumbers.add(randomNumber);
        }
    }

    public static String getGameResult() {

        if (gameResultCount[BALL_INDEX] == 0 && gameResultCount[STRIKE_INDEX] > 0) {
            return gameResultCount[STRIKE_INDEX] + "스트라이크";
        }
        if (gameResultCount[BALL_INDEX] > 0 && gameResultCount[STRIKE_INDEX] > 0) {
            return gameResultCount[BALL_INDEX] + "볼 " + gameResultCount[STRIKE_INDEX] + "스트라이크";
        }
        if (gameResultCount[STRIKE_INDEX] == 0 && gameResultCount[BALL_INDEX] > 0) {
            return gameResultCount[BALL_INDEX] +"볼";
        }
        return "낫싱";
    }

    public static void checkGameResult(List<Integer> randomNumbers, String number) {
        for (int i = 0; i < NUMBER_SIZE; i++) {
            int dividedNumber = returnDividedNumber(number, i);
            countGameResult(i, dividedNumber);
        }
    }

    public static void countGameResult(int index, int dividedNumber) {
        if (randomNumbers.get(index) == dividedNumber) {
            gameResultCount[STRIKE_INDEX]++;
            return;
        }

        if (randomNumbers.contains(dividedNumber)) {
            gameResultCount[BALL_INDEX]++;
        }
    }

    public static int returnDividedNumber(String number, int index) {
        return number.charAt(index) - CHAR_TO_NUMBER;
    }
}
