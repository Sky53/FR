package robot;

public class Robot {

    private int x;
    private int y;

    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    /**
     * текущее направление взгляда
     *
     * @return direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * текущая координата X
     *
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * текущая координата Y
     *
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * повернуться на 90 градусов против часовой стрелки
     */
    public void turnLeft() {
        if (this.direction == Direction.UP) {
            this.direction = Direction.LEFT;
        } else if (this.direction == Direction.LEFT) {
            this.direction = Direction.DOWN;
        } else if (this.direction == Direction.DOWN) {
            this.direction = Direction.RIGHT;
        } else if (this.direction == Direction.RIGHT) {
            this.direction = Direction.UP;
        }
    }

    /**
     * повернуться на 90 градусов по часовой стрелке
     */
    public void turnRight() {
        switch (this.direction) {
            case UP:
                this.direction = Direction.RIGHT;
                break;
            case DOWN:
                this.direction = Direction.LEFT;
                break;
            case LEFT:
                this.direction = Direction.UP;
                break;
            case RIGHT:
                this.direction = Direction.DOWN;
                break;
        }
    }

    /**
     * шаг в направлении взгляда
     * за один шаг робот изменяет одну свою координату на единицу
     */
    public void stepForward() {

        switch (this.direction) {
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
            case LEFT:
                x--;
                break;
            case RIGHT:
                x++;
                break;
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }
}

