package composition.challenge;

class PencuciPiringOtomatis {

    private boolean siapDijalankan;

    public void setSiapDijalankan(boolean siapDijalankan) {
        this.siapDijalankan = siapDijalankan;
    }

    public boolean isSiapDijalankan() {
        return siapDijalankan;
    }

    public void cuciPiring() {
        if (siapDijalankan) {
            System.out.println("Piring sedang dicuci");
        }
    }

}
