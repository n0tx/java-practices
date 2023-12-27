package composition.example;


public class PersonalComputer extends Product {

    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void drawLogo() {
        monitor.drawPixel(5, 5, "Silver Black");
    }

    public void powerOn() {
        computerCase.pressPowerButton();
        motherboard.loadProgram("System Operation");
        drawLogo();
    }

    public void printSpecs() {
        System.out.printf("%nPersonal Computer Specs: %n");
        System.out.printf("Motherboard: %s%n", motherboard);
        System.out.printf("Computer Case: %s%n", computerCase);
        System.out.printf("Monitor: %s%n", monitor);
    }
}
