public class Mahasiswa {
        String nama;
        String NIM; 
        String prodi;
    
        public Mahasiswa(String nama, String NIM, String prodi) {
            this.nama = nama;
            this.NIM = NIM;
            this.prodi = prodi;
        }
    
        public void tampilMahasiswa() {
            System.out.println("Nama : " + nama);
            System.out.println("NIM : " + NIM);
            System.out.println("Prodi : " + prodi); 
        }
    } 

