import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double KM_BASINA_UCRET = 2.20;
        final double ACILIS_UCRETI = 10.0;
        final double MINIMUM_UCRET = 20.0;

        System.out.println("TAKSİMETRE PROGRAMI");

        System.out.print("Gidilen mesafeyi KM cinsinden giriniz: ");
        double mesafe = scanner.nextDouble();

        double toplamUcret = ACILIS_UCRETI + (mesafe * KM_BASINA_UCRET);

        double odenecekTutar = Math.max(toplamUcret, MINIMUM_UCRET);

        System.out.println("Taksimetre Özeti");
        System.out.println("Gidilen Mesafe: " + mesafe + " KM");
        System.out.println("Açılış Ücreti: " + ACILIS_UCRETI + " TL");
        System.out.println("KM Başına Ücret: " + KM_BASINA_UCRET + " TL");
        System.out.println("Hesaplanan Tutar: " + toplamUcret + " TL");

        if (toplamUcret < MINIMUM_UCRET) {
            System.out.println("(Minimum ücret uygulandı)");
        }

        System.out.println("Ödenecek Tutar: " + odenecekTutar + " TL");

        scanner.close();
    }
}