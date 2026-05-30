public class Main {
    static void main(){
        ResizableCircle circle = new ResizableCircle(5.0);
        int percent = 125;

        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Perimeter is: " + circle.getPerimeter());
        System.out.println("Area is: " + circle.getArea());
        circle.resize(percent);
        System.out.println("Circle  resized by " + percent + "% has a radius of: " + circle.getRadius());
    }
}
