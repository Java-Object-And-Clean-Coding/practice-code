package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.nio.channels.spi.AbstractSelectionKey;
import java.util.ArrayList;
import java.util.List;

public class Application {
    private static final int NUMBER_SIZE = 3;
    private static int[] gameResultCount = {0, 0};
    private static final int STRIKE_INDEX = 0;
    private static final int BALL_INDEX = 0;

    public static List<Integer> makeRandomNumber() {
        List<Integer> randomNumbers = new ArrayList<>();

        while (randomNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }

        return randomNumbers;
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

    public static void checkGameResult(List<Integer> randomNumbers, int number) {
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (randomNumbers.get(i) == number) {
                gameResultCount[STRIKE_INDEX]++;
            } else if (randomNumbers.contains(number)) {
                gameResultCount[BALL_INDEX]++;
            }
        }
    }

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("숫자 야구 게임을 시작합니다.");
        List<Integer> randomNumbers = makeRandomNumber();

        System.out.println(randomNumbers);

        while (gameResultCount[STRIKE_INDEX] < 3) {
            System.out.print("숫자를 입력해주세요 : ");
            int number = Integer.parseInt(Console.readLine());

            checkGameResult(randomNumbers, number);

            printGameResult();
        }
    }
}
