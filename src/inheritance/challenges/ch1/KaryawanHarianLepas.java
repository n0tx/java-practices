package inheritance.challenges.ch1;

public class KaryawanHarianLepas extends Karyawan {
    private double gajiHarian;



    public KaryawanHarianLepas(String nama, String tanggalLahir, String tanggalJoin, double gajiHarian) {
        super(nama, tanggalLahir, tanggalJoin);
        this.gajiHarian = gajiHarian;
    }

    @Override
    public double gajian() {
        return 40 * gajiHarian;
    }

    public double gajiLembur() {
        return 2 * gajian();
    }
}
