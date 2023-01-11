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
    private static final String RESTART_CODE = "1";
    private static final String QUIT_CODE = "2";

    public static void main(String[] args) {
        ArrayList<Integer> randomNumberList;
        boolean IS_GAME_RESTARTED = true;

        System.out.println("숫자 야구 게임을 시작합니다.");
        while(IS_GAME_RESTARTED) {
            randomNumberList = new ArrayList<>(Randoms.pickUniqueNumbersInRange(1, 9, NUMBER_SIZE));
            System.out.println("--숫자 공개 test : " + randomNumberList);

            playBaseBallGame(randomNumberList);
            System.out.println("3개의 숫자를 모두 맞추셨습니다! 게임 종료.");
            IS_GAME_RESTARTED = checkIsGameRestart();
        }
    }

    // TODO : Class 분리 필요
    static void playBaseBallGame(ArrayList<Integer> randomNumberList) {
        String inputNumber;
        boolean isFinish = false;
        while(!isFinish) {
            System.out.print("숫자를 입력해주세요 : ");
            inputNumber = Console.readLine();
            validateInputNumber(inputNumber);

            isFinish = getGameResult(randomNumberList, inputNumber);
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
    static boolean getGameResult(ArrayList<Integer> randomNumberList, String input) {
        ArrayList<String> numberList = convertStringNumberToArrayListOfNumber(input);
        int ballCount = 0;
        int strikeCount = 0;

        for(int i = 0; i < numberList.size(); i++) {
            int numberIndex = input.indexOf(String.valueOf(randomNumberList.get(i)));
            if(numberIndex == i) {
                strikeCount++;
            }
            else if(numberIndex > 0){
                ballCount++;
            }
        }

        if(ballCount == 0 && strikeCount == 0) {
            System.out.print("낫싱");
        }

        if (ballCount > 0){
            System.out.print(ballCount + "볼 ");

        }

        if(strikeCount > 0) {
            System.out.print(strikeCount + "스트라이크 ");
        }

        System.out.println("");
        if(strikeCount == NUMBER_SIZE) {

            return true;
        }
        return false;
    }

    // TODO : 더 작은 단위로 메소드 분리
    static boolean checkIsGameRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String inputNumber = Console.readLine();

        if(inputNumber.equals(RESTART_CODE)) {
            return true;
        }
        else if(inputNumber.equals(QUIT_CODE)) {
            return false;
        }

        else {
            throw new IllegalArgumentException("올바른 입력 값(1, 2)이 아닙니다.");
        }
    }

    static ArrayList<String> convertStringNumberToArrayListOfNumber(String number) {
        return new ArrayList<>(Arrays.asList(number.split("")));
    }
}
