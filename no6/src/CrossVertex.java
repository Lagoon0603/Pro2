public class CrossVertex extends Vertex {
    @Override
    public void draw(Turtle t) {
        t.penDown();
        for (int i = 0; i < 4; i++) {
            t.fd(10);
            t.rt(180);
            t.fd(10);
            t.lt(90);
        }
    }
}
