public class Hexagon {
    void draw(Turtle t, Vertex v) {
        for (int i = 0; i < 6; i++) {
            v.draw(t);
            t.penUp();
            t.fd(50); // 正六角形の辺の移動距離
            t.rt(60); // 正六角形を描くための60度回転
        }
    }

    public static void main(String[] args) {
        Hexagon hexagon = new Hexagon();
        Turtle turtle = new Turtle(); // Turtleライブラリが存在する前提
        turtle.move(50, 160);
        hexagon.draw(turtle, new RectVertex());
        turtle.move(150, 250);
        hexagon.draw(turtle, new CrossVertex());
        turtle.move(250, 200);
        hexagon.draw(turtle, new HexVertex());
    }
}
