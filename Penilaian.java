public class Penilaian {

    Mahasiswa mahasiswa;
    Matkul mataKuliah;
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    Penilaian(Mahasiswa mahasiswa, Matkul mataKuliah, double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
    }

    void hitungNilaiAKhir() {
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4); 
    }

    void tampilPenilaian() {
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai UAS   : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}