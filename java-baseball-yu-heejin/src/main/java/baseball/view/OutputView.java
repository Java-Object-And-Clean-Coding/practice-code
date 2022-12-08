package baseball.view;
public class OutputView {
    public void printGameStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printInputNumberMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void printErrorMessage() {
        System.out.println("[ERROR] 올바른 값이 아닙니다.");
    }
}
