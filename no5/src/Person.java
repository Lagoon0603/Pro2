abstract class Person {
    private String name;
    private int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public int getMoney() {
        return this.money;
    }

    public void changeMoney(int spentMoney) {
        this.money = this.money-spentMoney;
    }

    public void print() {
        System.out.println(this.name + " now has " + this.money + " yen");
    }

    abstract int getFee();
}
