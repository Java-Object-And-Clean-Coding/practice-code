package baseball;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTest extends NsTest {
    Application application;

    @BeforeEach
    void doBefore() {
        application = new Application();
    }

    @Test
    void 스트라이크_테스트() {
        // given
        String number = "264";

        // when
        assertRandomNumberInRangeTest(
                () -> {
                    run(number);
                    assertThat(output()).contains("3스트라이크");
                },

                2, 6, 4, 2, 6, 4
        );

        // then
        // assertThat(output()).contains("3스트라이크");
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
