import java.util.Scanner;
import java.util.Arrays;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        Arrays.sort(list);

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < number && i > min) {
                min = i;
            }
            if (i > number && i < max) {
                max = i;
            }
        }

        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Girilen Sayı : " + number);

        if (min != Integer.MIN_VALUE) {
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        } else {
            System.out.println("Girilen sayıdan küçük sayı yok.");
        }

        if (max != Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
        } else {
            System.out.println("Girilen sayıdan büyük sayı yok.");
        }

        input.close();
    }
}