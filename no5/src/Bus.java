public class Bus extends Car {
    public Person[] passengers;
    private int totalFee;

    public Bus(int capacity) {
        passengers = new Person[capacity];
        totalFee = 0;
    }

    public int getBusNum() {
        return num;
    }

    public void getOn(Person p) {
        if (p.getMoney() < p.getFee()) {
            System.out.println(p.getName() + " could not get on the bus");
            return;
        }

        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = p;
                p.changeMoney(p.getFee());
                totalFee += p.getFee();
                p.print();
                return;
            }
        }
        
        System.out.println(p.getName() + " could not get on the bus");
    }

    public void getOff(Person p) {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == p) {
                passengers[i] = null;
                System.out.println(p.getName() + " got off the bus");
                return;
            }
        }
        System.out.println(p.getName() + " was not on the bus");
    }

    public void printAllPassengers() {
        for (Person p : passengers) {
            if (p != null) {
                System.out.println(p.getName());
            }
        }
    }

    public void printTotalFee() {
        System.out.println(totalFee);
    }
}
