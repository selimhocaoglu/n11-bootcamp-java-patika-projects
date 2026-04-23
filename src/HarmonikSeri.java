import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        double toplam = 0.0;

        for (int i = 1; i <= n; i++) {
            double terim = 1.0 / i;
            toplam += terim;
        }

        System.out.println("Sonuç: " + toplam);

        input.close();
    }
}