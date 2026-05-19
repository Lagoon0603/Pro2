public class RectVertex extends Vertex {
    public void draw(Turtle t) {
        t.penDown();
        for (int i = 0; i < 4; i++) {
            t.go(20);      // fd から go に修正
            t.rotate(90);  // rt から rotate に修正
        }
    }
}