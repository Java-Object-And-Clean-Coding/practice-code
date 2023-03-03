package baseball.view;

import baseball.view.model.InputMessage;

public class InputView {
    public void printInputValueMessage() {
        System.out.print(InputMessage.INPUT_NUMBER.getMessage());
    }

    public void printRestartGameMessage() {
        System.out.println(InputMessage.RESTART_GAME.getMessage());
    }
}
