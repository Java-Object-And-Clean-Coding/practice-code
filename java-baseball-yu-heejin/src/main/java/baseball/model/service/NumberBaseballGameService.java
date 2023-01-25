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

    public List<Integer> findRandomNumbers() {
        return numberBaseballGameRepository.findRandomNumbers();
    }
}
