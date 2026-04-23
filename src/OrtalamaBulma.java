import java.util.Scanner;

public class OrtalamaBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int adet = 0;

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                toplam += i;
                adet++;
            }
        }

        if (adet > 0) {
            double ortalama = (double) toplam / adet;
            System.out.println("\nToplam: " + toplam);
            System.out.println("Adet: " + adet);
            System.out.println("Ortalama: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı!");
        }

        input.close();
    }
}