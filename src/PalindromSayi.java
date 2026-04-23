import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int orijinalSayi = sayi;
        int tersSayi = 0;

        while (sayi != 0) {
            int basamak = sayi % 10;
            tersSayi = tersSayi * 10 + basamak;
            sayi /= 10;
        }

        if (orijinalSayi == tersSayi) {
            System.out.println(orijinalSayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(orijinalSayi + " bir palindrom sayı değildir.");
        }

        input.close();
    }
}