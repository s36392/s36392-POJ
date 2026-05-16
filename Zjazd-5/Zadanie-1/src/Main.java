public class Main {
    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];
        for(int i = 0; i <= 9; i++){
            points[i] = new MyPoint(i+1, i+1);
        }
    }
}

