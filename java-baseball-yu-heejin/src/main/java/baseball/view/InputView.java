package baseball.view;

import baseball.exception.ExceptionValidation;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private final ExceptionValidation EXCEPTION_VALIDATION;
    private final OutputView OUTPUT_VIEW;
    public InputView() {
        this.EXCEPTION_VALIDATION = new ExceptionValidation();
        this.OUTPUT_VIEW = new OutputView();
    }

    public String inputNumber() {
        try {
            String number = Console.readLine();

            EXCEPTION_VALIDATION.isNumber(number);
            EXCEPTION_VALIDATION.isMaxSizeNumber(number);

            return number;
        } catch(IllegalArgumentException illegalArgumentException) {
            OUTPUT_VIEW.printErrorMessage();
        }

        return null;
    }
}
