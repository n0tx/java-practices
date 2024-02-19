package object_casting_hapus;

public class LayarLebar {

    private String judul;

    public LayarLebar(String judul) {
        this.judul = judul;
    }

    public static LayarLebar getLayarLebar(String type, String judul) {
        System.out.println("public static LayarLebar getLayarLebar(String type, String judul)");
        System.out.printf("type: %s%n", type);
        System.out.printf("judul: %s%n", judul);
        return switch (type.toLowerCase().charAt(0)) {
            case 'p', 'P' -> new Petualangan(judul);
            case 'k', 'K' -> new Komedi(judul);
            default -> new LayarLebar(judul);
        };
    }

    public void nontonLayarLebar() {
        String instanceType = this.getClass().getSimpleName();
        System.out.printf("Lagi nonton %s%n", instanceType);
    }

}
