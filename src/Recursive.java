import java.util.Scanner;

public class Recursive {

    public static void recursive(int n, int orijinal, boolean azalt) {
        System.out.print(n + " ");

        if (n <= 0 && azalt) {
            azalt = false;
        }

        if (azalt) {
            recursive(n - 5, orijinal, azalt);
        } else {
            if (n < orijinal) {
                recursive(n + 5, orijinal, azalt);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int n = input.nextInt();

        System.out.print("Çıktısı : ");
        recursive(n, n, true);
        System.out.println();

        input.close();
    }
}