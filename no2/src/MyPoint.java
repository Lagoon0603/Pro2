public class MyPoint {
    public int x;
    public int y;
    public double getDistance() {
        return Math.sqrt(x * x + y * y);
    }
}