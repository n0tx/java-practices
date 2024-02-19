package polymorphism_exercise;

public class Car {

    private boolean engine;
    private int wheels;
    private int cylinders;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getInstanceType() {
        return this.getClass().getSimpleName();
    }

    public String startEngine() {
        return getInstanceType() + " -> startEngine()";
    }

    public String accelerate() {
        return getInstanceType() + " -> accelerate()";
    }

    public String brake() {
        return getInstanceType() + " -> brake()";
    }

}
