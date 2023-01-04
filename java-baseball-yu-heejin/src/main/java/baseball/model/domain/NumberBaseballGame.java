package baseball.model.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberBaseballGame {
    private final int MAX_NUMBERS_SIZE = 3;
    private final int MIN_NUMBER_RANGE = 1;
    private final int MAX_NUMBER_RANGE = 9;
    private List<Integer> randomNumbers;
    private List<Integer> gameResult;

    public NumberBaseballGame() {
        randomNumbers = makeRandomNumbers();
        gameResult = Arrays.asList(0, 0);
    }

    private List<Integer> makeRandomNumbers() {
        randomNumbers = new ArrayList<>();

        while (randomNumbers.size() < MAX_NUMBERS_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(MIN_NUMBER_RANGE, MAX_NUMBER_RANGE);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }

        return randomNumbers;
    }

    public List<Integer> getRandomNumbers() {
        return this.randomNumbers;
    }

    public void checkGameResult(String number) {
        for (int numberIndex = 0; numberIndex < randomNumbers.size(); numberIndex++) {
            int numberByCharAt = Integer.parseInt(String.valueOf(number.charAt(numberIndex)));

            if (randomNumbers.get(numberIndex) == numberByCharAt) {

            }
        }
    }
}
