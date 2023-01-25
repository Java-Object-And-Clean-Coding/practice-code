package baseball.model.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 해당 도메인을 DB 테이블이라고 생각해보자. */
public class NumberBaseballGame {
    private final int MIN_NUMBER_RANGE = 1;
    private final int MAX_NUMBER_RANGE = 9;
    private final int MAX_NUMBER_SIZE = 3;
    private final int INIT_RESULT_VALUE = 0;
    private List<Integer> randomNumbers;
    private List<Integer> gameResult;

    public NumberBaseballGame() {
        this.randomNumbers =  new ArrayList<>(Randoms.pickUniqueNumbersInRange(MIN_NUMBER_RANGE, MAX_NUMBER_RANGE, MAX_NUMBER_SIZE));
        this.gameResult = Arrays.asList(INIT_RESULT_VALUE, INIT_RESULT_VALUE);
    }

    public List<Integer> getRandomNumbers() {
        return randomNumbers;
    }
}
