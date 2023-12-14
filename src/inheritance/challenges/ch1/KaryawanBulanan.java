package inheritance.challenges.ch1;

public class KaryawanBulanan extends Karyawan {
    private double gajiBulanan;
    private boolean sudahResign;


    public KaryawanBulanan(String nama, String tanggalLahir, String tanggalJoin, double gajiBulanan) {
        super(nama, tanggalLahir, tanggalJoin);
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public double gajian() {
        double gaji = (sudahResign) ? this.gajiBulanan * 0.9 : this.gajiBulanan;
        return (int) gaji;
    }

    public void resign() {
        phk("12/15/2023");
        sudahResign = true;
    }

}
