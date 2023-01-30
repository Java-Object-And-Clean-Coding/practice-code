package baseball.view;

import baseball.model.domain.ResultMessage;
import baseball.model.domain.ViewMessage;

import java.util.List;

public class OutputView {
    private final int STRIKE_INDEX = 0;
    private final int BALL_INDEX = 1;

    public void printGameStartMessage() {
        System.out.println(ViewMessage.START.getViewMessage());
    }

    public void printInputNumberMessage() {
        System.out.print(ViewMessage.INPUT.getViewMessage());
    }

    public void printGameResult(List<Integer> gameResult) {
        System.out.println(getGameResultMessage(gameResult));
    }

    private String getGameResultMessage(List<Integer> gameResult) {
        if (gameResult.get(STRIKE_INDEX) == 0 && gameResult.get(BALL_INDEX) > 0) {
            return gameResult.get(BALL_INDEX) + ResultMessage.BALL.getResultMessage();
        }

        if (gameResult.get(BALL_INDEX) == 0 && gameResult.get(STRIKE_INDEX) > 0) {
            return gameResult.get(STRIKE_INDEX) + ResultMessage.STRIKE.getResultMessage();
        }

        if (gameResult.get(BALL_INDEX) > 0 && gameResult.get(STRIKE_INDEX) > 0) {
            return gameResult.get(BALL_INDEX) + ResultMessage.BALL.getResultMessage() + " " + gameResult.get(STRIKE_INDEX) + ResultMessage.STRIKE.getResultMessage();
        }

        return ResultMessage.NOTHING.getResultMessage();
    }

    public void printGameSuccessMessage() {
        System.out.println(ViewMessage.SUCCESS.getViewMessage());
    }

    public void printIsContinueMessage() {
        System.out.println(ViewMessage.QUESTION_CONTINUE.getViewMessage());
    }
}
