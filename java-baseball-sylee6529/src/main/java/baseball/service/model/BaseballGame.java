package baseball.service.model;

import camp.nextstep.edu.missionutils.Console;

public class BaseballGame {
    private String inputNumber;
    private boolean isFinish;

    public BaseballGame() {
        inputNumber = getInputNumberFromConsole();
        isFinish = false;
    }

    public boolean getIsFinish() {
        return isFinish;
    }

    public String getInputNumber() {
        return inputNumber;
    }

    public void setIsFinish(boolean isFinish) {
        this.isFinish = isFinish;
    }

    public String getInputNumberFromConsole() {
        System.out.println("before input");
        String input = Console.readLine();
        return input;
    }
}
