import java.util.Scanner;

public class Main {

    static Mahasiswa[] mhs = {
        new Mahasiswa("22001", "Ali Rahman", "D4 Teknik Informatika"),
        new Mahasiswa("22002", "Budi Santoso", "D3 Sistem Informasi"),
        new Mahasiswa("22003", "Citra Dewi", "D4 Sistem Informasi")
    };

    static Matkul[] mk = {
        new Matkul("MK001", "Struktur Data", 3),
        new Matkul("MK002", "Basis Data", 4),
        new Matkul("MK003", "Desain Web", 2)
    };

    static Penilaian[] penilaian = {
        new Penilaian(mhs[0], mk[0], 80, 85, 90),
        new Penilaian(mhs[0], mk[1], 60, 75, 70),
        new Penilaian(mhs[1], mk[0], 75, 70, 80),
        new Penilaian(mhs[2], mk[1], 85, 90, 95),
        new Penilaian(mhs[2], mk[2], 80, 90, 65)
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte pilihan;

        do {
            System.out.println("=== MENU ====");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Data Penilaian Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilihan = sc.nextByte();
            switch (pilihan) {
                case 1:
                    break;
                case 2:
                System.out.println("\n=== DATA MATA KULIAH ===");
                    for (Matkul Matkul : mk) {
                        Matkul.tampilMatkul();
                        System.out.println();
                    }
                    break;
                case 3:
                System.out.println("\n=== DATA PENILAIAN MAHASISWA ===");
                    for (Penilaian p : daftarNilai) {
                        p.tampilPenilaian();
                    }
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 0:
                    
                    break;
            
                default:
                System.out.println("Menu tidak valid! Silahkan input ulang.");
                    break;
            }
        } while(pilihan != 0);
    }
}
