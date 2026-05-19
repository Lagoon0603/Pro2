public class HexVertex extends Vertex {
    @Override
    public void draw(Turtle t) {
        t.penDown();
        for (int i = 0; i < 6; i++) {
            t.fd(15);
            t.rt(60);
        }
    }
}
