
public class Prob23 {
    public static void main(String[] args) {
        Turtle t;
        t = new Turtle();
        t.move(100, 100);
        t.penDown();
        for(int i=0;i<4;i++){
            t.go(41);
            t.rotate(90);
        }

        t = new Turtle();
        t.move(100, 300);
        t.penDown();
        for(int i=0;i<8;i++){
            t.go(41);
            t.rotate(45);
        }
    }
    
}
