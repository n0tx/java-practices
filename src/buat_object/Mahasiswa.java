package buat_object;

import java.util.Objects;

public class Mahasiswa {
    String nama;
    int nim;
    String jurusan;


    public Mahasiswa(String nama, int nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim=" + nim +
                ", jurusan='" + jurusan + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mahasiswa mahasiswa = (Mahasiswa) o;
        return nim == mahasiswa.nim && nama.equals(mahasiswa.nama) && jurusan.equals(mahasiswa.jurusan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nama, nim, jurusan);
    }
}
