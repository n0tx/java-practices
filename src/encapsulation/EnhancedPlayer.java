package encapsulation;

public class EnhancedPlayer {
    private String nama;
    private int persenDarah;
    private String senjata;


    public EnhancedPlayer(String nama) {
        this(nama, 100, "Pedang");
    }
    public EnhancedPlayer(String nama, int darah, String senjata) {
        this.nama = nama;
        if (darah <= 0) {
            this.persenDarah = 1;
        } else if (darah > 100) {
            this.persenDarah = 100;
        } else {
            this.persenDarah = darah;
        }
        this.senjata = senjata;
    }

    public String getNama() {
        return nama;
    }

    public int getPersenDarah() {
        return persenDarah;
    }

    public String getSenjata() {
        return senjata;
    }

    public void hilangDarah(int damage) {
        this.persenDarah = this.persenDarah - damage;
        if (this.persenDarah <= 0) {
            System.out.println("Player auto kick dari game");
        }
    }

    public void tambahDarah(int darahTambahan) {
        this.persenDarah = this.persenDarah + darahTambahan;
        if (this.persenDarah > 100) {
            System.out.println("Set darah 100%");
            this.persenDarah = 100;
        }
    }

    public int jumlahDarah() {
        return this.persenDarah;
    }

}
