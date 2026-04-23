import java.util.Scanner;

public class CiftVeDortKatiToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        while (true) {
            System.out.print("Bir sayı giriniz: ");
            sayi = input.nextInt();

            if (sayi % 2 == 1) {
                break;
            }

            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        }

        System.out.println("Çift ve 4'ün katları olan sayıların toplamı: " + toplam);

        input.close();
    }
}