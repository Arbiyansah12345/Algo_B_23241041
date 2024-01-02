import java.util.Scanner;

public class cektahunkabisat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Tahun: ");
        int jumlahTahun = scanner.nextInt();

        for (int i = 1; i <= jumlahTahun; i++) {
            System.out.print("Masukkan Tahun ke - " + i + " : ");
            int tahun = scanner.nextInt();

            if (cekTahunKabisat(tahun)) {
                System.out.println("Tahun Kabisat");
            } else {
                System.out.println("Bukan Tahun Kabisat");
            }
        }
    }

    // Fungsi untuk mengecek apakah suatu tahun kabisat atau bukan
    private static boolean cekTahunKabisat(int tahun) {
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            return true; // Tahun kabisat
        } else {
            return false; // Bukan tahun kabisat
        }
    }
}
