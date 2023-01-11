package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class Application {
    private static final int MAX_NUMBER_LIST_SIZE = 3;

    private static ArrayList<Integer> randomNumberList = new ArrayList<>();
    private static String inputNumber = "";

    public static void main(String[] args) {
        randomNumberList = new ArrayList<>(Randoms.pickUniqueNumbersInRange(1, 9, MAX_NUMBER_LIST_SIZE));
    }



}
