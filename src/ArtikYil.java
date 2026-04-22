import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        int yil = input.nextInt();

        boolean artikYil = false;

        if (yil % 400 == 0) {
            artikYil = true;
        } else if (yil % 100 == 0) {
            artikYil = false;
        } else if (yil % 4 == 0) {
            artikYil = true;
        }

        if (artikYil) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil + " bir artık yıl değildir !");
        }

        input.close();
    }
}