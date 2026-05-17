public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        int[] xy = {x, y};
    }

    public String toString() {
        return super.toString();
    }

    public double distance(int x, int y) {
        int x1 = Math.abs(this.x - getX());
        int y1 = Math.abs(this.y - getY());
        return Math.hypot(x1, y1);
    }

    public double distance(MyPoint another) {
        int x = Math.abs(another.x - this.x);
        int y = Math.abs(another.y - this.y);
        return Math.hypot(x, y);
    }

    public double distance() {
        int x = getX();
        int y = getY();
        return Math.hypot(x, y);
    }
}
