package encapsulation;

public class Player {
    public String nama;
    public int darah;
    public String senjata;

    public void hilangDarah(int damage) {
        this.darah = this.darah - damage;
        if (this.darah <= 0) {
            System.out.println("Player auto kick dari game");
        }
    }

    public void tambahDarah(int darahTambahan) {
        this.darah = this.darah + darahTambahan;
        if (this.darah > 100) {
            System.out.println("Set darah 100%");
            this.darah = 100;
        }
    }

    public int jumlahDarah() {
        return this.darah;
    }

}
