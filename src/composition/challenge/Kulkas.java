package composition.challenge;

class Kulkas {

    private boolean siapDijalankan;

    public void setSiapDijalankan(boolean siapDijalankan) {
        this.siapDijalankan = siapDijalankan;
    }

    public boolean isSiapDijalankan() {
        return siapDijalankan;
    }

    public void sediakanMakanan() {
        if (siapDijalankan) {
            System.out.println("Silahkan dinikmati menu hari ini ;) ");
        }
    }

}
