import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        int ebob = 1;
        int i = 1;
        int kucukSayi = Math.min(sayi1, sayi2);

        while (i <= kucukSayi) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println("EBOB(" + sayi1 + ", " + sayi2 + ") = " + ebob);
        System.out.println("EKOK(" + sayi1 + ", " + sayi2 + ") = " + ekok);

        input.close();
    }
}