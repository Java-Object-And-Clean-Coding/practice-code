package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Application {
    private static final int NUMBER_SIZE = 3;
    private static int[] gameResultCount;
    private static final int STRIKE_INDEX = 0;
    private static final int BALL_INDEX = 1;
    private static List<Integer> randomNumbers = new ArrayList<>();
    private static final char CHAR_TO_NUMBER = '0';
    private static String gameContinueAnswer = "1";


    public static void makeRandomNumber() {
        while (randomNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            insertRandomNumber(randomNumber);
        }
    }

    public static void insertRandomNumber(int randomNumber) {
        if (!randomNumbers.contains(randomNumber)) {
            randomNumbers.add(randomNumber);
        }
    }

    public static void printGameResult() {
        System.out.println(returnGameResult());
    }

    public static String returnGameResult() {
        if (gameResultCount[BALL_INDEX] == 0 && gameResultCount[STRIKE_INDEX] > 0) {
            return gameResultCount[STRIKE_INDEX] + "스트라이크";
        }
        if (gameResultCount[BALL_INDEX] > 0 && gameResultCount[STRIKE_INDEX] > 0) {
            return gameResultCount[BALL_INDEX] + "볼 " + gameResultCount[STRIKE_INDEX] + "스트라이크";
        }
        if (gameResultCount[STRIKE_INDEX] == 0 && gameResultCount[BALL_INDEX] > 0) {
            return gameResultCount[BALL_INDEX] +"볼";
        }
        return "낫싱";
    }

    public static void checkGameResult(List<Integer> randomNumbers, String number) {
        for (int i = 0; i < NUMBER_SIZE; i++) {
            int dividedNumber = returnDividedNumber(number, i);
            countGameResult(i, dividedNumber);
        }
    }

    public static void countGameResult(int index, int dividedNumber) {
        if (randomNumbers.get(index) == dividedNumber) {
            gameResultCount[STRIKE_INDEX]++;
            return;
        }

        if (randomNumbers.contains(dividedNumber)) {
            gameResultCount[BALL_INDEX]++;
        }
    }

    public static int returnDividedNumber(String number, int index) {
        return number.charAt(index) - CHAR_TO_NUMBER;
    }

    public static String inputUserNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String number = Console.readLine();

        return number;
    }

    public static void inputGameContinueAnswer() {
        if (gameResultCount[STRIKE_INDEX] == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            gameContinueAnswer = Console.readLine();

            if (gameContinueAnswer.equals("1")) {
                randomNumbers.clear();
            }
        }
    }

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("숫자 야구 게임을 시작합니다.");

        while (gameContinueAnswer.equals("1")) {
            gameResultCount = new int[]{0, 0};
            makeRandomNumber();
            System.out.println(randomNumbers);

            String number = inputUserNumber();

            checkGameResult(randomNumbers, number);

            printGameResult();

            inputGameContinueAnswer();
        }
    }
}
