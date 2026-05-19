public class Hexagon {
    void draw(Turtle t, Vertex v) {
        for (int i = 0; i < 6; i++) {
            v.draw(t);
            t.penUp();
            t.go(50);      // fd から go に修正
            t.rotate(60);  // rt から rotate に修正
        }
    }

    public static void main(String[] args) {
        Hexagon hexagon = new Hexagon();
        Turtle turtle = new Turtle();
        
        turtle.move(50, 160);
        hexagon.draw(turtle, new RectVertex());
        
        turtle.move(150, 250);
        hexagon.draw(turtle, new CrossVertex());
        
        turtle.move(250, 200);
        hexagon.draw(turtle, new HexVertex());
    }
}