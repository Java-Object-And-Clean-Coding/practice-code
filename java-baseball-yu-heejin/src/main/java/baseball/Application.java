package baseball;

import baseball.view.InputUI;
import baseball.view.OutputView;

public class Application {
    private static final OutputView OUTPUT_VIEW = new OutputView();
    private static final InputUI INPUT_UI = new InputUI();
    public static void main(String[] args) {
        OUTPUT_VIEW.printGameStartMessage();
        OUTPUT_VIEW.printInputNumberMessage();
        String number = INPUT_UI.inputUserNumber();

        System.out.println(number);
    }
}
