package encapsulation;

public class Main {
    public static void main(String[] args) {

        Player riki = new Player();

        riki.nama = "Riki";
        riki.darah = 20;
        riki.senjata = "Pedang";

        int damage = 10;
        riki.hilangDarah(damage);
        System.out.printf("%nSisa darah %s: %d%n", riki.nama, riki.jumlahDarah());

        riki.darah = 200;
        riki.hilangDarah(11);
        System.out.printf("Sisa darah %s: %d%n", riki.nama, riki.jumlahDarah());


        EnhancedPlayer candra = new EnhancedPlayer("candra", 200, "Pedang");

        int damageCandra = 10;
        candra.hilangDarah(damageCandra);
        System.out.printf("%nSisa darah %s: %d%n", candra.getNama(), candra.jumlahDarah());

    }

}
