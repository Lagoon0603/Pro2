public class Prob24 {
    public static void main(String[] args) {
    Turtle t;
    t = new Turtle();
    t.move(100, 250);
    t.penDown();
    for(int i=0;i<3;i++){
        t.setColor( java.awt.Color.blue);
        t.go(41);
        t.rotate(40);
        t.setColor( java.awt.Color.green);
        t.go(41);
        t.rotate(40);
        t.setColor( java.awt.Color.yellow);
        t.go(41);
        t.rotate(40);
    }
    }
}
