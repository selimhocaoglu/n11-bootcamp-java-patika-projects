import java.util.Scanner;

public class DaireHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14;

        System.out.println("DAİRE ALAN VE ÇEVRE HESAPLAMA");

        System.out.print("Dairenin yarıçapını giriniz: ");
        double r = scanner.nextDouble();

        double alan = PI * r * r;

        double cevre = 2 * PI * r;
        System.out.println("Daire Hesaplama Sonuçları");
        System.out.println("Yarıçap: " + r);
        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);


        System.out.println("DAİRE DİLİMİ ALAN HESAPLAMA");

        System.out.print("Daire diliminin yarıçapını giriniz: ");
        double r2 = scanner.nextDouble();

        System.out.print("Merkez açısını (derece) giriniz: ");
        double aci = scanner.nextDouble();

        double dilimAlani = (PI * (r2 * r2) * aci) / 360;

        System.out.println("Daire Dilimi Hesaplama Sonuçları");
        System.out.println("Yarıçap: " + r2);
        System.out.println("Merkez Açısı: " + aci + "°");
        System.out.println("Daire Diliminin Alanı: " + dilimAlani);

        scanner.close();
    }
}