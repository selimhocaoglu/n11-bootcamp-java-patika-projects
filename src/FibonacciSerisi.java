import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();

        int sayi1 = 0, sayi2 = 1;

        System.out.print(n + " Elemanlı Fibonacci Serisi: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(sayi1 + " ");

            int toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }

        input.close();
    }
}