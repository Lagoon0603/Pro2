public class Prob210 {
    public static void main(String[] args){
        MyRectangle m = new MyRectangle();
        m.setPoints(20,26,4,17);
        m.computeLength();
        m.computeWidth();
        int A = m.computeArea();
        int C = m.computeCircumference();
        System.out.println("The area of the rectangle is " + A + ", and the circumference is " + C);
    }
}
