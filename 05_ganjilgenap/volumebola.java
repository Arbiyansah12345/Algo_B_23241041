import java.util.Scanner;

public class volumebola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari bola (dalam satuan cm): ");
        double jariJari = input.nextDouble();

        // Menghitung volume bola
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);

        System.out.println("Volume bola adalah: " + volume + " cm^3");

        input.close();
    }
}
