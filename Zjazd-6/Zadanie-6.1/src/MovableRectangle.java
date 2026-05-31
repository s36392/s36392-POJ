public class MovableRectangle implements Movable {
    private final int xSpeed;
    private final int ySpeed;

    MovablePoint topLeft = new MovablePoint(0, 0);
    MovablePoint bottomRight = new MovablePoint(0, 0);

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft.setX(x1);
        topLeft.setY(y1);
        bottomRight.setX(x2);
        bottomRight.setY(y2);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
         topLeft.setY(topLeft.getY() + ySpeed);
         bottomRight.setY(bottomRight.getY() + ySpeed);
    }

    @Override
    public void moveDown() {
        topLeft.setY(topLeft.getY() - ySpeed);
        bottomRight.setY(bottomRight.getY() - ySpeed);
    }

    @Override
    public void moveRight() {
        topLeft.setX(topLeft.getX() + xSpeed);
        bottomRight.setX(bottomRight.getX() + xSpeed);
    }

    @Override
    public void moveLeft() {
        topLeft.setX(topLeft.getX() - xSpeed);
        bottomRight.setX(bottomRight.getX() - xSpeed);
    }
}
