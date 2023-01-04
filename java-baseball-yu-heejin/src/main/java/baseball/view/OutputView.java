package baseball.view;

import baseball.model.domain.ViewMessage;

public class OutputView {
    public void printGameStartMessage() {
        System.out.println(ViewMessage.START.getViewMessage());
    }

    public void printInputNumberMessage() {
        System.out.print(ViewMessage.INPUT.getViewMessage());
    }
}
