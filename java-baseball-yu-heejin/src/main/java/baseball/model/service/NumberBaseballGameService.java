package baseball.model.service;

import baseball.model.repository.NumberBaseballGameRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 비즈니스 로직을 처리하는 Service */
public class NumberBaseballGameService {
    private final int STRIKE_INDEX = 0;
    private final int BALL_INDEX = 1;
    private final int INIT_RESULT_VALUE = 0;
    private NumberBaseballGameRepository numberBaseballGameRepository;

    public NumberBaseballGameService() {
        numberBaseballGameRepository = new NumberBaseballGameRepository();
    }

    public List<Integer> findRandomNumbers() {
        return numberBaseballGameRepository.findRandomNumbers();
    }

    public void updateRandomNumbers() {
        numberBaseballGameRepository.updateRandomNumbers();
    }

    public List<Integer> findGameResult(List<Integer> randomNumbers, String number) {
        return createGameResult(randomNumbers, number);
    }

    private List<Integer> createGameResult(List<Integer> randomNumbers, String number) {
        List<Integer> gameResult = Arrays.asList(INIT_RESULT_VALUE, INIT_RESULT_VALUE);

        for (int numberIndex = 0; numberIndex < randomNumbers.size(); numberIndex++) {
            int numberByCharAt = Integer.parseInt(String.valueOf(number.charAt(numberIndex)));
            gameResult = addGameResultValue(randomNumbers, gameResult, numberIndex, numberByCharAt);
        }

        numberBaseballGameRepository.updateGameResult(gameResult);

        return numberBaseballGameRepository.findGameResult();
    }

    private List<Integer> addGameResultValue(List<Integer> randomNumbers, List<Integer> gameResult, int numberIndex, int numberByCharAt) {
        if (randomNumbers.get(numberIndex) == numberByCharAt) {
            int result = gameResult.get(STRIKE_INDEX) + 1;
            gameResult.set(STRIKE_INDEX, result);
            return gameResult;
        }

        if (randomNumbers.contains(numberByCharAt)) {
            int result = gameResult.get(BALL_INDEX) + 1;
            gameResult.set(BALL_INDEX, result);
        }

        return gameResult;
    }
}
