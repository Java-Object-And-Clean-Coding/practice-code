package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Application {
    private static String gameContinueAnswer = "1";





    public static String inputUserNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String number = Console.readLine();

        return number;
    }

    public static void inputGameContinueAnswer() {
        if (gameResultCount[STRIKE_INDEX] == 3) {
            printSuccessGameMessage();

            printInputGameContinueAnswerMessage();
            gameContinueAnswer = Console.readLine();

            clearRandomNumberByGameContinueAnswer();
        }
    }

    public static void printSuccessGameMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void printInputGameContinueAnswerMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void clearRandomNumberByGameContinueAnswer() {
        if (gameContinueAnswer.equals("1")) {
            randomNumbers.clear();
        }
    }

    public static void main(String[] args) {
        // TODO: 프로그램 구현

        while (gameContinueAnswer.equals("1")) {
            String number = inputUserNumber();

            checkGameResult(randomNumbers, number);

            printGameResult();

            inputGameContinueAnswer();
        }
    }
}
