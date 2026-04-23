import java.util.Scanner;

public class AsalSayiRecursive {

    public static boolean asalMi(int sayi, int bolen) {
        if (sayi < 2) {
            return false;
        }

        if (bolen == 1) {
            return true;
        }

        if (sayi % bolen == 0) {
            return false;
        }

        return asalMi(sayi, bolen - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int sayi = input.nextInt();

        boolean sonuc = asalMi(sayi, sayi / 2);

        if (sonuc) {

            System.out.println(sayi + " sayısı asaldır");
        } else {

            System.out.println(sayi + " sayısı asal değildir");
        }

        input.close();
    }
}