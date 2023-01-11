package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// TODO : Model, View, Controller로 나누어보기
public class Application {
    private static final int NUMBER_SIZE = 3;

    public static void main(String[] args) {
        ArrayList<Integer> randomNumberList;
        String inputNumber;
        boolean IS_GAME_RESTARTED = true;

        while(IS_GAME_RESTARTED) {
            randomNumberList = new ArrayList<>(Randoms.pickUniqueNumbersInRange(1, 9, NUMBER_SIZE));
            System.out.println("숫자 야구 게임을 시작합니다.");

            System.out.print("숫자를 입력해주세요 : ");
            inputNumber = Console.readLine();
            validateInputNumber(inputNumber);

            printGameResult(randomNumberList, inputNumber);

            IS_GAME_RESTARTED = checkIsGameRestart(inputNumber);
        }
    }

    // TODO : Input Model Class 분리 및 내부 메소드로 추가
    static void validateInputNumber(String input) {
        if(input.length() != NUMBER_SIZE) {
            throw new IllegalArgumentException("3자리 숫자가 아닙니다.");
        }

        ArrayList<String> numberList = convertStringNumberToArrayListOfNumber(input);
        Set<String> numberSet = new HashSet<>(numberList);

        if(numberList.size() != numberSet.size()) {
            throw new IllegalArgumentException("서로 다른 숫자가 아닙니다.");
        }

        if(numberList.contains("0")) {
            throw  new IllegalArgumentException("1부터 9까지의 숫자로 이루어져야 합니다.");
        }
    }

    // TODO : Output Model Class 분리 및 멤버 변수 및 메소드로 추가
    static void printGameResult(ArrayList<Integer> randomNumberList, String input) {
        ArrayList<String> numberList = convertStringNumberToArrayListOfNumber(input);
        int ballCount = getBallCount(randomNumberList, numberList);
        int strikeCount = getStrikeCount(randomNumberList, numberList);

        if(ballCount == 0 && strikeCount == 0) {
            System.out.println("낫싱");
        }
        else {
            System.out.println(ballCount + "카운트 " + strikeCount + "스트라이크");
        }
    }

    static int getBallCount(ArrayList<Integer> randomNumberList, ArrayList<String> numberList) {
        return -1;
    }

    static int getStrikeCount(ArrayList<Integer> randomNumberList, ArrayList<String> numberList) {
        return -1;
    }

    // TODO : 더 작은 단위로 메소드 분리
    static boolean checkIsGameRestart(String input) {
        return false;
    }

    static ArrayList<String> convertStringNumberToArrayListOfNumber(String number) {
        return new ArrayList<>(Arrays.asList(number.split("")));
    }
}
