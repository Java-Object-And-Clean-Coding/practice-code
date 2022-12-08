package baseball;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private final ExceptionValidation EXCEPTION_VALIDATION;
    private final OutputView OUTPUT_VIEW;

    public InputView() {
        this.EXCEPTION_VALIDATION = new ExceptionValidation();
        this.OUTPUT_VIEW = new OutputView();
    }

    public String inputNumber() {
        OUTPUT_VIEW.printGameStartMessage();
        try {
            String number = Console.readLine();

            EXCEPTION_VALIDATION.isNumber(number);
            EXCEPTION_VALIDATION.isMaxSizeNumber(number);

            return number;
        } catch (IllegalArgumentException exception) {
            System.out.println("[ERROR] 올바른 입력 값이 아닙니다.");
        }

        return null;
    }

    public String inputGameContinueNumber() {
        OUTPUT_VIEW.printInputGameContinueAnswerMessage();
        try {

        } catch (IllegalArgumentException exception) {

        }
    }
}
