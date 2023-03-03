package baseball.view;

import baseball.view.model.InputMessage;
import baseball.view.model.OutputMessage;

public class OutputView {
    public void printStartGameMessage() {
        System.out.println(OutputMessage.START_GAME.getMessage());
    }

    public void printEndGameMessage() {
        System.out.println(OutputMessage.END_GAME.getMessage());
    }



}
