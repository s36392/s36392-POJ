public class Main {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(0, 0, 1, 0, 0, 1);
        MyTriangle t2 = new MyTriangle(0, 0, 2, 0, 1, 1);
        MyTriangle t3 = new MyTriangle(
                new MyPoint(0, 0),
                new MyPoint(2, 0),
                new MyPoint(1, 0)
        );

        System.out.println(t1);
        System.out.printf("Perimeter: %.2f%n", t1.getPerimeter());
        System.out.println("Type: " + t1.getType());
        System.out.println();

        System.out.println(t2);
        System.out.printf("Perimeter: %.2f%n", t2.getPerimeter());
        System.out.println("Type: " + t2.getType());
    }
}