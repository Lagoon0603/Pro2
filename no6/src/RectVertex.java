public class RectVertex extends Vertex {
    @Override
    public void draw(Turtle t) {
        t.penDown();
        for (int i = 0; i < 4; i++) {
            t.fd(20);
            t.rt(90);
        }
    }
}
