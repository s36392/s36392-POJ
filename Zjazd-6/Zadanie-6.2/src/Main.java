public class Main {
        static void main(){
        ResizableCircle circle = new ResizableCircle(5.0);
        int percent = 125;

        System.out.printf("Radius is: %.2f%n", circle.getRadius());
        System.out.printf("Perimeter is: %.2f%n", circle.getPerimeter());
        System.out.printf("Area is: %.2f%n", circle.getArea());
        circle.resize(percent);
        System.out.print("Circle  resized by " + percent + "% has a radius of: ");
        System.out.printf("%.2f%n", circle.getRadius());
    }
}
