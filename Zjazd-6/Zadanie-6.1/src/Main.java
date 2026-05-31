public class Main {
    static void main() {
        MovableRectangle rectangle = new MovableRectangle(4, 4, 6, 6, 2, 2);
        System.out.println(rectangle.topLeft.getY());
        rectangle.moveUp();
        System.out.println(rectangle.topLeft.getY());
    }
}
