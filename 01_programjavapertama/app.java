public class app {
    public static void main(String[] args) throws Exception {
        // program biodata mahasiswa
        // deklarasi variable
        String nama;
        String nim;
        String tgl_lahir;
        String alamat;
        float berat_badan;
        float tinggi_badan;

        // mengisi variable
        nama = "muhammad arbiyan saputra";
        nim = "23241041";
        tgl_lahir = " 24 april 2005";
        alamat = "lombok timur";
        berat_badan = 45.3f;
        tinggi_badan = 160.4f;

        // cetak badan
        System.out.println("===============");
        System.out.println("Nama : " + nama);
        System.out.println("NIM: ");
        System.out.println("tanggal lahir : " + tgl_lahir);
        System.out.println("alamat : " + alamat);
        System.out.println("berat badan : " + berat_badan);
        System.out.println("tinggi badan : " + tinggi_badan);
        System.out.println("=====================");
    }
}