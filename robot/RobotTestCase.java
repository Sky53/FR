package robot;

public class RobotTestCase {
    private int toX;
    private int toY;

    private Robot robot;

    public RobotTestCase(int toX, int toY, Robot robot) {
        this.toX = toX;
        this.toY = toY;
        this.robot = robot;
    }

    public int getToX() {
        return toX;
    }

    public int getToY() {
        return toY;
    }

    public Robot getRobot() {
        return robot;
    }

    @Override
    public String toString() {
        return "RobotTestCase{" +
                "toX=" + toX +
                ", toY=" + toY +
                ", robot=" + robot +
                '}';
    }
}
