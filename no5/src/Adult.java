public class Adult extends Person {
    public Adult(String name, int money) {
        super(name, money);
    }

    int getFee() {
        return 220;
    }
}
