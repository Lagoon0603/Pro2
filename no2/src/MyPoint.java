public class MyPoint {
    int x;
    int y;
    double getDistance() {
        return Math.sqrt(x * x + y * y);
    }
}