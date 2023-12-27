package composition.example;

public class ComputerCase extends Product {

    private Dimensions dimensions;
    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, Dimensions dimensions, String powerSupply) {
        super(model, manufacturer);
        this.dimensions = dimensions;
        this.powerSupply = powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void pressPowerButton() {
        System.out.printf("%nPower Button Pressed%n");
    }

    @Override
    public String toString() {
        return "ComputerCase{" +
                "dimensions=" + dimensions +
                ", powerSupply='" + powerSupply + '\'' +
                "} " + super.toString();
    }
}
