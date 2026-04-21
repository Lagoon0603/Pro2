public class MyPointNew {
    int x;
    int y;
    double getDistance() {
        return Math.sqrt(x * x + y * y);
    }

    void setPoint(int px, int py){
        x = px;
        y = py;
    }

    void printCoord(){
        System.out.println("(" + x + ", " + y + ")");
    }
}