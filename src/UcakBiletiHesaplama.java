import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        double mesafe = input.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = input.nextInt();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri");
        } else {
            double normalTutar = mesafe * 0.10;
            double yasIndirimOrani = 0;

            if (yas < 12) {
                yasIndirimOrani = 0.50;
            } else if (yas <= 24) {
                yasIndirimOrani = 0.10;
            } else if (yas > 65) {
                yasIndirimOrani = 0.30;
            }

            double yasIndirimi = normalTutar * yasIndirimOrani;
            double indirimliTutar = normalTutar - yasIndirimi;

            if (yolculukTipi == 2) {
                double gidisDonusIndirimi = indirimliTutar * 0.20;
                indirimliTutar = indirimliTutar - gidisDonusIndirimi;
                indirimliTutar = indirimliTutar * 2;
            }

            System.out.println("Toplam Tutar = " + indirimliTutar + "TL");
        }

        input.close();
    }
}