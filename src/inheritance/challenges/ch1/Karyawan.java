package inheritance.challenges.ch1;

public class Karyawan extends Pekerja {

    private long karyawanId;
    private String tanggalJoin;

    private static int nomerKaryawan = 1;

    public Karyawan(String nama, String tanggalLahir, String tanggalJoin) {
        super(nama, tanggalLahir);
        this.karyawanId = Karyawan.nomerKaryawan++;
        this.tanggalJoin = tanggalJoin;
    }

    @Override
    public String toString() {
        return "Karyawan{" +
                "karyawanId=" + karyawanId +
                ", tanggalJoin='" + tanggalJoin + '\'' +
                "} " + super.toString();
    }
}
