import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];
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
                System.out.println("\n=== Data Mahasiswa ====");
                for (Mahasiswa mhs : daftarMahasiswa) {
                    System.out.println("NIM : " + mhs. NIM);
                    System.out.println("Nama : " + mhs.nama);
                    System.out.println("Prodi : " + mhs.prodi);
                    System.out.println();
                }
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
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
