import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        double matematik = scanner.nextDouble();

        System.out.print("Fizik notunuzu giriniz: ");
        double fizik = scanner.nextDouble();

        System.out.print("Kimya notunuzu giriniz: ");
        double kimya = scanner.nextDouble();

        System.out.print("Türkçe notunuzu giriniz: ");
        double turkce = scanner.nextDouble();

        System.out.print("Tarih notunuzu giriniz: ");
        double tarih = scanner.nextDouble();

        System.out.print("Müzik notunuzu giriniz: ");
        double muzik = scanner.nextDouble();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Ortalamanız: " + ortalama);

        String durum;
        if (ortalama >= 60) {
            durum = "Sınıfı geçti.";
        } else {
            durum = "Sınıfta kaldı.";
        }
        System.out.println("Durum: " + durum);

        scanner.close();
    }
}