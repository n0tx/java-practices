package inheritance.challenges.ch1;

public class Pekerja {
    private String nama;
    private String tanggalLahir;
    protected String tanggalPensiun;

    public Pekerja() {}

    public Pekerja(String nama, String tanggalLahir) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    public int getUmur() {
        int tahunSekarang = 2023;
        int tahunLahir = Integer.parseInt(this.tanggalLahir.substring(6));
        return tahunSekarang - tahunLahir;
    }

    public double gajian() {
        return 0d;
    }

    public void phk(String tanggalPensiun) {
        this.tanggalPensiun = tanggalPensiun;
    }

    @Override
    public String toString() {
        return "Pekerja{" +
                "nama='" + nama + '\'' +
                ", tanggalLahir='" + tanggalLahir + '\'' +
                ", tanggalPensiun='" + tanggalPensiun + '\'' +
                '}';
    }
}
