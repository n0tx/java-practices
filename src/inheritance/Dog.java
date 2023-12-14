package inheritance;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Anjing Kampung", "Besar", 30);
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "big"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(String type, double weight) {
        this(type, weight, "Kuping Runcing", "Ekor Belok");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        // System.out.println("Dogs walks, run and swag the tails");
        if (speed == "slow") {
            walk();
            wagtail();
        } else {
            run();
            bark();
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Ow Woooo!");
        }
        bark();
        System.out.println();
    }

    public void bark() {
        System.out.println("bark");
    }

    public void run() {
        System.out.println("run");
    }

    public void walk() {
        System.out.println("walk");
    }

    public void wagtail() {
        System.out.println("wagtail");
    }
}
