package baseball.controller;

import baseball.service.BaseballService;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class BaseballController {
    private static final int MAX_NUMBER_SIZE = 3;
    private static final String RESTART_CODE = "1";
    private static final String QUIT_CODE = "2";

    private OutputView outputView = new OutputView();
    private BaseballService baseballService = new BaseballService();

    ArrayList<Integer> randomNumberList;
    boolean isGameRestarted = true;

    public void initRepeatedBaseballGame() {
        outputView.printStartGameMessage();

        while(isGameRestarted) {
            randomNumberList = new ArrayList<>(Randoms.pickUniqueNumbersInRange(1, 9, MAX_NUMBER_SIZE));
//            System.out.println("--숫자 공개 test : " + randomNumberList);

            baseballService.playBaseBallGame(randomNumberList);

            outputView.printEndGameMessage();

            isGameRestarted = checkIsGameRestart();
        }
    }

    // TODO : Exception Message 정리
    static boolean checkIsGameRestart() {
        String inputNumber = Console.readLine();

        if(inputNumber.equals(RESTART_CODE)) {
            return true;
        }
        else if(inputNumber.equals(QUIT_CODE)) {
            return false;
        }

        else {
            throw new IllegalArgumentException("올바른 입력 값(1, 2)이 아닙니다.");
        }
    }
}
