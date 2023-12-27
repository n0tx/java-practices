package composition.challenge;

public class DapurPintar {

    private KopiOtomatis kopiOtomatis;
    private Kulkas kulkas;
    private PencuciPiringOtomatis pencuciPiringOtomatis;

    public DapurPintar() {
        this.kopiOtomatis = new KopiOtomatis();
        this.kulkas = new Kulkas();
        this.pencuciPiringOtomatis = new PencuciPiringOtomatis();
    }

    public void masukinPiringKotor(boolean status) {
        pencuciPiringOtomatis.setSiapDijalankan(status);
    }

    public void masukinKopiDanAir(boolean status) {
        kopiOtomatis.setSiapDijalankan(status);
    }

    public void masukinStockMakananKeKulkas(boolean status) {
        kulkas.setSiapDijalankan(status);
    }

    public void beberes(String status) {
        masukinPiringKotor(status.equals("beres"));
        masukinKopiDanAir(status.equals("beres"));
        masukinStockMakananKeKulkas(status.equals("beres"));
    }

    public void dapurPintarDijalankan() {
        if (kopiOtomatis.isSiapDijalankan()) {
            kopiOtomatis.rebusKopi();
        }
        if (kulkas.isSiapDijalankan()) {
            kulkas.sediakanMakanan();
        }
        if (pencuciPiringOtomatis.isSiapDijalankan()) {
            pencuciPiringOtomatis.cuciPiring();
        }
    }
}

