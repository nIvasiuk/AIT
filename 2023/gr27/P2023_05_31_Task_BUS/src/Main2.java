public class Main2 {
    public static void main(String[] args) {
        Driver marsel = new Driver("Марсель", 29);
        Driver petr = new Driver("Петр", 14);
        Bus bus1 = new Bus("X35");
        Bus bus2 = new Bus("Y35");

        marsel.setBus(bus1);
        marsel.drive();
        petr.setBus(bus1);
        petr.drive();
        marsel.setBus(bus1);
        marsel.drive();
    }
}
