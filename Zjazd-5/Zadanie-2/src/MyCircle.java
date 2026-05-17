public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle(){
        center = new MyPoint(0, 0);
        radius = 1;
    }

    public MyCircle(int x, int y, int radius){
        center = new MyPoint(x, y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX(){
        getCenter();

    }
}
