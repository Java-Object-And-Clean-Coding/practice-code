package baseball.model.service;

import baseball.model.repository.NumberBaseballGameRepository;

import java.util.List;

/* 비즈니스 로직을 처리하는 Service */
public class NumberBaseballGameService {
    private final int STRIKE_INDEX = 0;
    private final int BALL_INDEX = 1;
    private NumberBaseballGameRepository numberBaseballGameRepository;

    public NumberBaseballGameService() {
        numberBaseballGameRepository = new NumberBaseballGameRepository();
    }

    public List<Integer> getRandomNumbers() {
        return numberBaseballGameRepository.getRandomNumbers();
    }

    public List<Integer> getGameResult() {
        return numberBaseballGameRepository.getGameResult();
    }

    public List<Integer> createGameResult(List<Integer> randomNumbers, String number) {
        List<Integer> gameResult = numberBaseballGameRepository.getGameResult();

        for (int numberIndex = 0; numberIndex < randomNumbers.size(); numberIndex++) {
            int numberByCharAt = Integer.parseInt(String.valueOf(number.charAt(numberIndex)));
            addGameResultValue(gameResult, numberIndex, numberByCharAt);
        }

        numberBaseballGameRepository.setGameResult(gameResult);

        return gameResult;
    }

    private void addGameResultValue(List<Integer> gameResult, int numberIndex, int numberByCharAt) {
        List<Integer> randomNumbers = numberBaseballGameRepository.getRandomNumbers();

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
