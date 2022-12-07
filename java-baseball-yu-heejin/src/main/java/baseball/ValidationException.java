package baseball;

public class ValidationException {
    public int isNumber(String inputNumber) {
        try {
            int changeNumber = Integer.parseInt(inputNumber);

            return changeNumber;
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException();
        }
    }
}
