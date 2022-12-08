package baseball;

public class ExceptionValidation {
    private final int MAX_SIZE = 3;

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
        if (!number.equals("1"))
    }
}
