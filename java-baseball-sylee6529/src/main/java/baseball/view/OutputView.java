package baseball.view;

import baseball.view.model.OutputMessage;

public class OutputView {
    public void printStartGameMessage() {
        System.out.println(OutputMessage.START_GAME.getMessage());
    }

    public void printEndGameMessage() {
        System.out.println(OutputMessage.END_GAME.getMessage());
    }

    public void printInputValueMessage() {
        System.out.print(OutputMessage.INPUT_NUMBER.getMessage());
    }

    public void printRestartGameMessage() {
        System.out.println(OutputMessage.RESTART_GAME.getMessage());
    }

}
