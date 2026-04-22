import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        int a = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        int b = input.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        int c = input.nextInt();

        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Küçükten Büyüğe Sıralama: " + a + " < " + b + " < " + c);

        input.close();
    }
}