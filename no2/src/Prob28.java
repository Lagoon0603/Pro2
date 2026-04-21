public class Prob28 {
    public static void main(String[] args) {
        Turtle t;
        t = new Turtle();
        t.move(200, 150);
        // t.rotate(180);
        t.penDown();
        int a = 10;
        for(int i=0;i<15;i++){
            for(int j=0;j<2;j++){
                t.go(a);
                t.rotate(90);
            }
            a = a+6;
        }
    }
}