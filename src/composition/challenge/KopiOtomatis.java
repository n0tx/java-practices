package composition.challenge;

class KopiOtomatis {

    private boolean siapDijalankan;

    public void setSiapDijalankan(boolean siapDijalankan) {
        this.siapDijalankan = siapDijalankan;
    }

    public boolean isSiapDijalankan() {
        return siapDijalankan;
    }

    public void rebusKopi() {
        if (siapDijalankan) {
            System.out.println("Rebus Kopi berjalan...");
        }
    }

}
