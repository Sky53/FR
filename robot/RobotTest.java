package robot;

public class RobotTest {
    private static final RobotTestCase TEST_CASE_1 = new RobotTestCase(3, 2, new Robot(5, 4, Direction.DOWN));
    private static final RobotTestCase TEST_CASE_2 = new RobotTestCase(6, 9, new Robot(1, 8, Direction.LEFT));
    private static final RobotTestCase TEST_CASE_3 = new RobotTestCase(2, 1, new Robot(5, 5, Direction.UP));
    private static final RobotTestCase TEST_CASE_4 = new RobotTestCase(0, 0, new Robot(7, 4, Direction.RIGHT));
    private static final RobotTestCase TEST_CASE_5 = new RobotTestCase(9, 7, new Robot(0, 10, Direction.UP));

    public static void main(String[] args) {
        testRobot(TEST_CASE_1);
        testRobot(TEST_CASE_2);
        testRobot(TEST_CASE_3);
        testRobot(TEST_CASE_4);
        testRobot(TEST_CASE_5);
    }

    private static void moveRobot(Robot robot, int toX, int toY) {
           int tX = robot.getX();
           int tY = robot.getY();

        if (tX >= toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (tX != toX) {
                robot.stepForward();
                tX--;
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (tX != toX) {
                robot.stepForward();
                tX++;
            }
        }
        if (tY >= toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (tY != toY) {
                robot.stepForward();
                tY--;
            }

        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (tY != toY) {
                robot.stepForward();
                tY++;
            }

        }

    }


    private static void testRobot(RobotTestCase robotTestCase) {
        System.out.println("Start " + robotTestCase);
        moveRobot(robotTestCase.getRobot(), robotTestCase.getToX(), robotTestCase.getToY());
        System.out.println("End " + robotTestCase.getRobot());
        if (robotTestCase.getToX() != robotTestCase.getRobot().getX() || robotTestCase.getToY() != robotTestCase.getRobot().getY()) {
            System.out.println("ERROR!!!");
        } else {
            System.out.println("SUCCESS!!!!!");
        }
        System.out.println();

    }
}