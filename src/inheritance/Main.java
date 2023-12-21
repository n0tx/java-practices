package inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 300);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog perky = new Dog("Perky", 10);
        doAnimalStuff(perky, "fast");

        Dog retriever = new Dog("Lambrador Retriever", 37, "Kuping Bulat", "Ekor Perenang");
        doAnimalStuff(retriever, "slow");

    }
    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("------");
        System.out.println();
    }
}
