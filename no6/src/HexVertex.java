public class HexVertex extends Vertex {
    public void draw(Turtle t) {
        t.penDown();
        for (int i = 0; i < 6; i++) {
            t.go(15);
            t.rotate(60);
        }
    }
}