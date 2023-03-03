package baseball.service;

import baseball.controller.BaseballController;
import baseball.service.model.BaseballGame;
import baseball.view.InputView;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BaseballService {
    private static final int MAX_NUMBER_SIZE = 3;

    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();
    private BaseballGame baseballGame = new BaseballGame();

    public void playBaseBallGame(ArrayList<Integer> randomNumberList) {
        while(!baseballGame.getIsFinish()) {
            inputView.printInputValueMessage();

            baseballGame.getInputNumberFromConsole();
            String inputNumber = baseballGame.getInputNumber();

            validateInputNumber(inputNumber);

            // TODO : GameResult Class 분리
            if(getGameResult(randomNumberList, inputNumber)) {
                baseballGame.setIsFinish(true);
                outputView.printEndGameMessage();
            }

        }
    }

    // TODO : InputNumber Class 분리 + Exception Message 정리
    public void validateInputNumber(String input) {
        if(input.length() != MAX_NUMBER_SIZE) {
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

    static boolean getGameResult(ArrayList<Integer> randomNumberList, String input) {
        ArrayList<String> numberList = convertStringNumberToArrayListOfNumber(input);
        int ballCount = 0;
        int strikeCount = 0;

        for(int i = 0; i < numberList.size(); i++) {
            int numberIndex = input.indexOf(String.valueOf(randomNumberList.get(i)));
            if(numberIndex == i) {
                strikeCount++;
            }
            else if(numberIndex >= 0){
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
        if(strikeCount == MAX_NUMBER_SIZE) {
            return true;
        }
        return false;
    }

    public static ArrayList<String> convertStringNumberToArrayListOfNumber(String number) {
        return new ArrayList<>(Arrays.asList(number.split("")));
    }
}
