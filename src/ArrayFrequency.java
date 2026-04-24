import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequency = new int[array.length];
        // -1 -1 -1 -1 -1 -1 -1 -1

        Arrays.fill(frequency, -1);

        System.out.println("Dizi : " + Arrays.toString(array));
        System.out.println("Tekrar Sayıları");

        for (int i = 0; i < array.length; i++) {
            int count = 1;

            if (frequency[i] != -1) {
                continue;
            }

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    frequency[j] = 0;
                }
            }

            System.out.println(array[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}