public class Prob25 {
    public static void main(String[] args){
        MyPoint p = new MyPoint();
        p.x=20;
        p.y=26;
        double d = p.getDistance();
        System.out.println("点Pの原点からの距離は" + d + "です。");
        
        MyPoint q = new MyPoint();
        q.x=4;
        q.y=17;
        double D = q.getDistance();
        System.out.println("点Qの原点からの距離は" + D + "です。");
    }
}
