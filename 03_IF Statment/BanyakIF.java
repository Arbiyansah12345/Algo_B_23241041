import java.util.Scanner;

public class BanyakIF {
    public static void main(String[] args) {

        // Data member
        int nilai;
        String grade;

        // INPUT SCANNER
        Scanner scan = new Scanner(System.in);

        // Memasukan input dari keyboard
        System.out.print("Masukkan Nilai : ");
        nilai = scan.nextInt();

        // IF Statement
        if (nilai >= 80) {
            grade = "A";
        } else if (nilai >= 70 && nilai <= 79) {
            grade = "B";
        } else if (nilai >= 60 && nilai <= 69) {
            grade = "C";
        } else if (nilai >= 50 && nilai <= 59) {
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.println("nilai: " + nilai);
        System.out.println("grade:" + grade);

    }
}
