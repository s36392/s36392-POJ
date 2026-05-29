public class Main {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(0, 0, 5);
        MyCircle c2 = new MyCircle(new MyPoint(3, 4), 3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.printf("Area of c1: %.2f%n", c1.getArea());
        System.out.printf("Circumference of c1: %.2f%n", c1.getCircumference());
        System.out.printf("Distance between centers: %.2f%n", c1.distance(c2));
    }
}