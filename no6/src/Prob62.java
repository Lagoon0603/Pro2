public class Prob62 {
    public class S {
        final void methodS() { System.out.println(“S”); }
    }
    public class T extends S {
        void methodS() { System.out.println(“T”); }
    }
}
