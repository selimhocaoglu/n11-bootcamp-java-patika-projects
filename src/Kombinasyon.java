import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = input.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = input.nextInt();

        if (r > n || r < 0 || n < 0) {
            System.out.println("Geçersiz (r <= n ve her ikisi de >= 0 olmalı)");
        } else {
            int nFaktoriyel = 1;
            for (int i = 1; i <= n; i++) {
                nFaktoriyel *= i;
            }

            int rFaktoriyel = 1;
            for (int i = 1; i <= r; i++) {
                rFaktoriyel *= i;
            }

            int nrFaktoriyel = 1;
            for (int i = 1; i <= (n - r); i++) {
                nrFaktoriyel *= i;
            }

            int kombinasyon = nFaktoriyel / (rFaktoriyel * nrFaktoriyel);

            System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
        }

        input.close();
    }
}