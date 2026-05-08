class G {
    void methodG() { System.out.println("G"); }
}
class H extends G {
    void methodH() { System.out.println("H"); }
}
public class Prob55 {
    public static void main(String[] args) {
        H h = new G();
    }
}