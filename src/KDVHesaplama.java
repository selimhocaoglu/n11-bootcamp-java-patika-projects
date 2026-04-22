import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {

        final double KDV18 = 0.18;
        final double KDV8 = 0.08;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürünün fiyatını giriniz (TL): ");
        double fiyat = scanner.nextDouble();

        double kdvOrani = (fiyat > 0 && fiyat <= 1000) ? KDV18 : KDV8;

        double kdvTutari = fiyat * kdvOrani;

        double kdvliFiyat = fiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + fiyat + " TL");
        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");
        System.out.println("KDV'li Fiyat: " + kdvliFiyat + " TL");

        scanner.close();
    }
}