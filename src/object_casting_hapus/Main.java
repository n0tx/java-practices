package object_casting_hapus;

public class Main {
    public static void main(String[] args) {
        LayarLebar petualangan = LayarLebar.getLayarLebar("Petualangan", "Wiro Sableng 212");
        petualangan.nontonLayarLebar();

        LayarLebar komedi = LayarLebar.getLayarLebar("Komedi", "Mr. Bean");
        komedi.nontonLayarLebar();

        LayarLebar layarLebar = LayarLebar.getLayarLebar("Lainnya", "Power Ranger");
        layarLebar.nontonLayarLebar();
    }

}
