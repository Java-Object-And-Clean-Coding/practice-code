package baseball.model.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomNumbers {
    private List<Integer> randomNumbers;
    private final int START_RANGE = 1;
    private final int END_RANGE = 9;

    public RandomNumbers() {
        randomNumbers = createRandomNumber();
    }

    public List<Integer> createRandomNumber() {
        randomNumbers.clear();
        List<Integer> tempRandomNumbers = new ArrayList<>();

        while (tempRandomNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(START_RANGE, END_RANGE);
            insertNumberIfNotContain(tempRandomNumbers, randomNumber);
        }

        return tempRandomNumbers;
    }

    private void insertNumberIfNotContain(List<Integer> tempRandomNumbers, int randomNumber) {
        if (tempRandomNumbers.contains(randomNumber)) {
            randomNumbers.add(randomNumber);
        }
    }
}
