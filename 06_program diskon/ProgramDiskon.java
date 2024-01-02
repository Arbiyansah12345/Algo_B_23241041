import java.util.Scanner;

public class ProgramDiskon {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Apakah pelanggan memiliki meebercand? (Iya/Tidak): ");
        String memilikiMeebercand = Scanner.next();

        if (memilikiMeebercand.equalsIgnoreCase("Iya")) {
            System.out.print("Total belanja (dalam rb): ");
            double totalBelanja = Scanner.nextDouble();

            if (totalBelanja > 500000) {
                System.out.println("Pelanggan mendapatkan diskon sebesar 50rb.");
            } else if (totalBelanja > 100000) {
                System.out.println("Pelanggan mendapatkan diskon sebesar 15rb.");
            } else {
                System.out.println("Pelanggan tidak mendapatkan diskon.");
            }
        } else {
            System.out.print("Total belanja (dalam rb): ");
            double totalBelanja = Scanner.nextDouble();

            if (totalBelanja > 100000) {
                System.out.println("Pelanggan mendapatkan diskon sebesar 10rb.");
            } else {
                System.out.println("Pelanggan tidak mendapatkan diskon.");
            }
        }
    }
}