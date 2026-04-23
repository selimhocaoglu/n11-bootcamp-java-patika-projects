import java.util.Scanner;

public class UsluSayiRecursive {

    public static int usAl(int taban, int us) {
        if (us == 0) {
            return 1;
        }
        return taban * usAl(taban, us - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz :");
        int taban = input.nextInt();

        System.out.print("Üs değerini giriniz : ");
        int us = input.nextInt();

        int sonuc = usAl(taban, us);

        System.out.println("Sonuç : " + sonuc);

        input.close();
    }
}