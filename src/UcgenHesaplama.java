import java.util.Scanner;

public class UcgenHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DİK ÜÇGENDE HİPOTENÜS HESAPLAMA\n");

        System.out.print("Birinci dik kenarı giriniz: ");
        double a = scanner.nextDouble();

        System.out.print("İkinci dik kenarı giriniz:");
        double b = scanner.nextDouble();

        double hipotenus = Math.sqrt((a * a) + (b * b));

        System.out.println("Hipotenüs: " + hipotenus);


        System.out.println("ÜÇGEN ALAN HESAPLAMA");

        System.out.print("Birinci kenar uzunluğu (a): ");
        double kenar1 = scanner.nextDouble();

        System.out.print("İkinci kenar uzunluğu (b): ");
        double kenar2 = scanner.nextDouble();

        System.out.print("Üçüncü kenar uzunluğu (c): ");
        double kenar3 = scanner.nextDouble();

        double u = (kenar1 + kenar2 + kenar3) / 2;

        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

        System.out.println("Sonuçlar");
        System.out.println("Yarı çevre (u): " + u);
        System.out.println("Üçgenin Alanı: " + alan);

        scanner.close();
    }
}