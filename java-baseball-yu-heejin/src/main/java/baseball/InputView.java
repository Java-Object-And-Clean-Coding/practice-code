package baseball;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private ValidationException validationException;

    public InputView() {
        this.validationException = new ValidationException();
    }

    public int inputNumber() {
        try {
            System.out.println("숫자 야구 게임을 시작합니다.");
            System.out.print("숫자를 입력해주세요 : ");
            String number = Console.readLine();

            validationException.isNumber(number);

            return Integer.parseInt(number);
        } catch (IllegalArgumentException exception) {
            System.out.println("[ERROR] 올바른 입력 값이 아닙니다.");
        }

        return -1;
    }
}
