
public class Point {
    private static final int VALID_NUMBER_START = 1;
    private static final int VALID_NUMBER_END = 24;
    private int x;
    private int y;

    Point(){
    }

    Point(String input){
        setPoint(input);
    }

    public void setPoint(String input) {
        String[] splitInput = split(input);
        setX(Integer.parseInt(splitInput[0]));
        setY(Integer.parseInt(splitInput[1]));
    }

    private String[] split(String input) {
        input = input.replace("(", "").replace(")", "");
        String[] split = input.split(",");
        if(split.length != 2) {
            throw new RuntimeException("유효하지 않은 입력입니다");
        }
        return split;
    }

    public void setX(int x) {
        if(x < VALID_NUMBER_START || x > VALID_NUMBER_END) {
            throw new RuntimeException("유효하지 않은 x좌표 입니다");
        }
        this.x = x;
    }

    public void setY(int y) {
        if(y < VALID_NUMBER_START || y > VALID_NUMBER_END) {
            throw new RuntimeException("유효하지 않은 y좌표 입니다");
        }
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
