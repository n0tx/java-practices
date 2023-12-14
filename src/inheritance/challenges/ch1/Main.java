package inheritance.challenges.ch1;

public class Main {
    public static void main(String[] args) {
        Karyawan riki = new Karyawan("Riki", "09/21/1983", "12/14/2023");
        System.out.println(riki);
        System.out.println("Umur = " + riki.getUmur());
        System.out.println("Bayaran = " + riki.gajian());

        KaryawanBulanan candra = new KaryawanBulanan("Candra", "09/21/1983","12/14/2023", 5000000);
        System.out.println(candra);
        System.out.println("Umur = " + candra.getUmur());
        System.out.println("Bayaran = " + candra.gajian());
        candra.resign();
        System.out.println(candra);
        System.out.println("Gaji Pensiun = " + candra.gajian());

        KaryawanHarianLepas rikiCandra = new KaryawanHarianLepas("Riki Candra", "09/21/1983","12/14/2023", 20);
        System.out.println(rikiCandra);
        System.out.println("Umur = " + rikiCandra.getUmur());
        System.out.println("Bayaran Harian = " + rikiCandra.gajian());
        System.out.println("Bayaran Kerja di Hari Libur = " + rikiCandra.gajiLembur());
    }
}
