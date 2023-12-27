package composition.example;

public class Monitor extends Product {

    private Resolution resolution;

    private int size;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, Resolution resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void drawPixel(int x, int y, String color) {
        System.out.printf("Drawing pixel at x = %d, y = %d in color %s%n", x, y, color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution=" + resolution +
                ", size=" + size +
                "} " + super.toString();
    }
}
