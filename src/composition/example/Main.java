package composition.example;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);

        ComputerCase computerCase = new ComputerCase("ROG Style", "Asus", dimensions, "Corsair");

        Resolution resolution = new Resolution(2540, 1440);

        Monitor monitor = new Monitor("Wide Screen", "Samsung", 25, resolution);

        Motherboard motherboard = new Motherboard("ROG", "Asus", 4, 2, "v2.50");

        PersonalComputer personalComputer = new PersonalComputer("ROG PC", "Asus", computerCase, monitor, motherboard);

        personalComputer.printSpecs();

        personalComputer.powerOn();

    }

}
