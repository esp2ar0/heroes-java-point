import org.junit.After;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {
    Point point;

    @Test
    public void 성공() {
        String input = "(8,10)";
        point = new Point(input);
        assertThat(point.getX()).isEqualTo(8);
        assertThat(point.getY()).isEqualTo(10);
    }

    @Test(expected = RuntimeException.class)
    public void 유효하지_않은_x좌표() {
        String input = "(0,23)";
        point = new Point(input);
    }

    @Test(expected = RuntimeException.class)
    public void 유효하지_않은_y좌표() {
        String input = "(8,25)";
        point = new Point(input);
    }

    @Test(expected = RuntimeException.class)
    public void 유효하지_않은_입력_1개() {
        String input = "(3)";
        point = new Point(input);
    }

    @Test(expected = RuntimeException.class)
    public void 유효하지_않은_입력_2개초과() {
        String input = "(0,23,1)";
        point = new Point(input);
    }

    @After
    public void tearDown() {
        point = null;
    }
}