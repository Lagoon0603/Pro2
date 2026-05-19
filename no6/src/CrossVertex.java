public class CrossVertex extends Vertex {
    public void draw(Turtle t) {
        t.penDown();
        for (int i = 0; i < 4; i++) {
            t.go(10);
            t.rotate(180);
            t.go(10);
            t.rotate(180);
            t.rotate(90);
        }
    }
}