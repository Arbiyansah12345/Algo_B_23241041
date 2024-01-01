import java.util.Scanner;

public class kecepatanpercepatan {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai kecepatan awal
        System.out.print("Masukkan kecepatan awal (m/s): ");
        double kecepatanAwal = scanner.nextDouble();

        // Meminta pengguna memasukkan nilai kecepatan akhir
        System.out.print("Masukkan kecepatan akhir (m/s): ");
        double kecepatanAkhir = scanner.nextDouble();

        // Meminta pengguna memasukkan waktu
        System.out.print("Masukkan waktu (s): ");
        double waktu = scanner.nextDouble();

        // Menghitung percepatan menggunakan rumus (v - u) / 
        double percepatan = (kecepatanAkhir - kecepatanAwal) / waktu;

        // Menghitung kecepatan rata-rata menggunakan rumus (v + u) / 2
        double kecepatanRataRata = (kecepatanAwal + kecepatanAkhir) / 2;

        // Menampilkan hasil
        // System.out.println("Percepatan adalah: " + percepatan + " m/s^2");
        System.out.println("Kecepatan rata-rata adalah: " + kecepatanRataRata + " m/s");

        scanner.close();
    }
}
