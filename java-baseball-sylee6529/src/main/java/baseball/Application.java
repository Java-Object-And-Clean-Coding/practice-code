package baseball;

import baseball.controller.BaseballController;


public class Application {
    private static BaseballController baseballController = new BaseballController();

    public static void main(String[] args) {
        baseballController.initRepeatedBaseballGame();
    }
}
