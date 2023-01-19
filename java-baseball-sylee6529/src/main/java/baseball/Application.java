package baseball;

import baseball.controller.BaseballController;
import baseball.service.BaseballService;
import baseball.service.model.BaseballGame;
import baseball.view.InputView;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Application {
    private static BaseballController baseballController = new BaseballController();

    public static void main(String[] args) {
        baseballController.initRepeatedBaseballGame();
    }




}
