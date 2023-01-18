package baseball.model.service;

import baseball.model.domain.NumberBaseballGame;
import baseball.model.repository.NumberBaseballGameRepository;

/* 비즈니스 로직을 처리하는 Service */
public class NumberBaseballGameService {
    private NumberBaseballGameRepository numberBaseballGameRepository;

    public NumberBaseballGameService() {
        numberBaseballGameRepository = new NumberBaseballGameRepository();
    }

    public NumberBaseballGame getNumberBaseballGame() {
        return numberBaseballGameRepository.getNumberBaseballGame();
    }
}
