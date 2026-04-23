import java.util.Scanner;

public class FibonacciRecursive {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();

        System.out.print(n + " Elemanlı Fibonacci Serisi: ");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        input.close();
    }
}