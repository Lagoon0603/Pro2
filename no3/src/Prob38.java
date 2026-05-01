public class Prob38 {
    public static void main(String[] args) {
        MyPoint38 p = new MyPoint38();
        p.setPoint(20, 26);

        MyPoint38 q = new MyPoint38();
        q.setPoint(4, 24);

        System.out.println("2点間の距離は" + p.getDistanceFrom(q));
    }
}
