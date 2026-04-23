import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5'in kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 5) {
            System.out.println(i);
        }

        input.close();
    }
}