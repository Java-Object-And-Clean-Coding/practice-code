package baseball.exception;

public class ExceptionValidation {
    private final int MAX_SIZE = 3;
    private final String CONTINUE_ANSWER = "1";
    private final String NOT_CONTINUE_ANSWER = "2";

    // TODO: 생성자 사용해보기

    public void isNumber(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException();
        }
    }

    public void isMaxSizeNumber(String number) {
        if (number.length() != MAX_SIZE) {
            throw new IllegalArgumentException();
        }
    }

    public void isOneOrTwo(String number) {
        if (!number.equals(CONTINUE_ANSWER) || !number.equals(NOT_CONTINUE_ANSWER)) {
            throw new IllegalArgumentException();
        }
    }
}
