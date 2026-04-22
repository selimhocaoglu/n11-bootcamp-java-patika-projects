import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matematik, fizik, turkce, kimya, muzik;
        int toplam = 0;
        int dersSayisi = 0;

        System.out.print("Matematik notunuz : ");
        matematik = input.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            toplam += matematik;
            dersSayisi++;
        }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            dersSayisi++;
        }

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            dersSayisi++;
        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            dersSayisi++;
        }

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            dersSayisi++;
        }

        if (dersSayisi > 0) {
            double ortalama = (double) toplam / dersSayisi;
            System.out.println("Ortalamanız : " + ortalama);

            if (ortalama >= 55) {
                System.out.println("Sınıfı Geçtiniz!");
            } else {
                System.out.println("Sınıfta Kaldınız!");
            }
        } else {
            System.out.println("Geçerli not girilmedi!");
        }

        input.close();
    }
}