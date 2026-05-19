public class CrossVertex extends Vertex {
    public void draw(Turtle t) {
        t.penDown();
        for (int i = 0; i < 4; i++) {
            t.go(10);       // fd から go に修正
            t.rotate(180);  // rt から rotate に修正
            t.go(10);       // fd から go に修正
            t.rotate(180);  // rt から rotate に修正
            t.rotate(90);   // rt から rotate に修正
        }
    }
}