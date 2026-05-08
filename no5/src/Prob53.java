public class Prob53 {
    public class D {
        private int x;
        protected int y;
        void check (D d) {
        d = 1; // (1)
        d.x = 2; // (2)
        y = 3; // (3)
        d.y = 4; // (4)
        }
    }

    public class E extends D {
        void check (E e, D d) {
        x = 5; // (5)
        d.x = 6; // (6)
        e.x = 7; // (7)
        y = 8; // (8)
        d.y = 9; // (9)
        e.y = 10; // (10)
        }
    }
}
