import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double ARMUT_FIYAT = 2.14;
        final double ELMA_FIYAT = 3.67;
        final double DOMATES_FIYAT = 1.11;
        final double MUZ_FIYAT = 0.95;
        final double PATLICAN_FIYAT = 5.00;

        System.out.print("Armut Kaç Kilo ? :");
        double armutKg = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        double elmaKg = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        double domatesKg = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        double muzKg = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        double patlicanKg = scanner.nextDouble();

        double toplamTutar = (armutKg * ARMUT_FIYAT) +
                (elmaKg * ELMA_FIYAT) +
                (domatesKg * DOMATES_FIYAT) +
                (muzKg * MUZ_FIYAT) +
                (patlicanKg * PATLICAN_FIYAT);

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");

        scanner.close();
    }
}