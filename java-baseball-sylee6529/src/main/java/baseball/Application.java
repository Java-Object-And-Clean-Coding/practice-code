package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Application {
    private static final int NUMBER_SIZE = 3;

    private static ArrayList<Integer> randomNumberList = new ArrayList<>();
    private static String inputNumber = "";
    private static boolean IS_GAME_RESTARTED = true;

    public static void main(String[] args) {
        while(IS_GAME_RESTARTED) {
            randomNumberList = new ArrayList<>(Randoms.pickUniqueNumbersInRange(1, 9, NUMBER_SIZE));
            System.out.println("숫자 야구 게임을 시작합니다.");

            System.out.print("숫자를 입력해주세요 : ");
            inputNumber = Console.readLine();
            validateInputNumber(inputNumber);

            String result = getGameResult(inputNumber);
            System.out.println(result);

            IS_GAME_RESTARTED = checkIsGameRestart(inputNumber);
        }
    }

    static void validateInputNumber(String input) {
        if(input.length() != NUMBER_SIZE) {
            throw new IllegalArgumentException("3자리 숫자가 아닙니다.");
        }

        ArrayList<String> numberList = new ArrayList<>(Arrays.asList(inputNumber.split("")));
        Set<String> numberSet = new HashSet<>(numberList);

        if(numberList.size() != numberSet.size()) {
            throw new IllegalArgumentException("서로 다른 숫자가 아닙니다.");
        }

        if(numberList.contains("0")) {
            throw  new IllegalArgumentException("1부터 9까지의 숫자로 이루어져야 합니다.");
        }
    }

    static String getGameResult(String input) {
        return "";
    }

    static boolean checkIsGameRestart(String input) {
        return false;
    }

}
