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
    private static List<Integer> randomNumbers;
    private static final char CHAR_TO_NUMBER = '0';
    private static String gameContinueAnswer = "1";


    public static void makeRandomNumber() {
        randomNumbers = new ArrayList<>();

        while (randomNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
    }

    public static void printGameResult() {
        if (gameResultCount[BALL_INDEX] == 0 && gameResultCount[STRIKE_INDEX] > 0) {
            System.out.println(gameResultCount[STRIKE_INDEX] + "스트라이크");
        } else if (gameResultCount[BALL_INDEX] > 0 && gameResultCount[STRIKE_INDEX] > 0) {
            System.out.println(gameResultCount[BALL_INDEX] + "볼 " + gameResultCount[STRIKE_INDEX] + "스트라이크");
        } else if (gameResultCount[STRIKE_INDEX] == 0 && gameResultCount[BALL_INDEX] > 0) {
            System.out.println(gameResultCount[BALL_INDEX] +"볼");
        } else {
            System.out.println("낫싱");
        }
    }

    public static void checkGameResult(List<Integer> randomNumbers, String number) {
        for (int i = 0; i < NUMBER_SIZE; i++) {
            int dividedNumber = returnDividedNumber(number, i);
            if (randomNumbers.get(i) == dividedNumber) {
                gameResultCount[STRIKE_INDEX]++;
                continue;
            }
            if (randomNumbers.contains(dividedNumber)) {
                gameResultCount[BALL_INDEX]++;
            }
        }
    }

    public static int returnDividedNumber(String number, int index) {
        return number.charAt(index) - CHAR_TO_NUMBER;
    }

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("숫자 야구 게임을 시작합니다.");
        makeRandomNumber();
        System.out.println(randomNumbers);

        while (gameContinueAnswer.equals("1")) {
            gameResultCount = new int[]{0, 0};
            System.out.print("숫자를 입력해주세요 : ");
            String number = Console.readLine();

            checkGameResult(randomNumbers, number);

            printGameResult();

            if (gameResultCount[STRIKE_INDEX] == 3) {
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                gameContinueAnswer = Console.readLine();
            }
        }
    }
}
